package org.service;

import java.sql.Timestamp;

import org.model.MvcUser;

public class MvcService {

	public boolean isUserCreated(MvcUser user) {
		// TODO Auto-generated method stub
		user.setCreatedTimestamp(new Timestamp(System.currentTimeMillis()));
		return true;
	}

}
