package org.service;

import java.sql.Timestamp;

import org.dao.MvcDao;
import org.model.User;

public class MvcService {
	MvcDao dao = new MvcDao();

	public boolean isUserCreated(User user) {
		System.out.println("inside Service");
		boolean isUserDetailsCreated = isUserDetailsCreated(user);
		if(isUserDetailsCreated) {
			boolean isUserSaved = dao.isUserSaved(user);
			if(isUserSaved) {
				return true;
			}
		}
		return false;
	}

	private boolean isUserDetailsCreated(User user) {
		user.setCreatedTimestamp(new Timestamp(System.currentTimeMillis()));
		return true;
	}

}
