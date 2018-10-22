package org.service;

import java.sql.Timestamp;

import org.model.User;

public class MvcService {

	public boolean isUserCreated(User user) {
		// TODO Auto-generated method stub
		user.setCreatedTimestamp(new Timestamp(System.currentTimeMillis()));
		return true;
	}

}
