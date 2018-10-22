package org.controller;

import org.model.User;
import org.service.MvcService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	MvcService service = new MvcService();

	@RequestMapping("/" )
	public ModelAndView home() {
		System.out.println("Inside home");
		User user = new User();
		ModelAndView model = new ModelAndView("home.jsp");
		model.addObject("User", user);
		return model;
	}

	
	@RequestMapping("send" )
	public ModelAndView hello(@ModelAttribute("User") User user ) {
		System.out.println("Inside hello");
		ModelAndView model = new ModelAndView("welcome.jsp");
		if (user.getAge() != null) {
			System.out.println("User Name = " + user.getName());
			System.out.println("User Age = " + user.getAge());
			boolean isUserCreated = service.isUserCreated(user);
			if(isUserCreated) {
				model.addObject("User", user);
				model.addObject("message", "welcome User Created Successfully");
			}else {
			model.addObject("message", "Sorry User Not created");
		}
	}else {
		model.addObject("message", "User Is Empty");
	}
		return model;
	}
	
}
