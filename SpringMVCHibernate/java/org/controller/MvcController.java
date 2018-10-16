package org.controller;

import org.model.MvcUser;
import org.service.MvcService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	MvcService service = new MvcService();
	
	@RequestMapping("/send")
	public ModelAndView hello(@ModelAttribute MvcUser user ) {
		System.out.println("Inside hello");
		ModelAndView model = new ModelAndView("welcome.jsp");
		if (user != null) {
			boolean isUserCreated = service.isUserCreated(user);
			if(isUserCreated) {
				model.addObject("user", user);
				model.addObject("message", "welcome User Created Successfully");
			}else {
			model.addObject("message", "Sorry User Not created");
		}
	}
		model.addObject("message", "User Is Empty");
		return model;
	}
	
}
