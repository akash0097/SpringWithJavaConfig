package org.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.User;
import org.utils.HibernateUtil;

public class MvcDao {

	HibernateUtil hibernateUtil = new HibernateUtil();
	public boolean isUserSaved(User user) {
		System.out.println("Inside Dao");
		Session session = hibernateUtil.getHibernateSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("Transaction begin");
		session.save(user);
		System.out.println("Session saved");
		transaction.commit();
		System.out.println("transaction commited");
		//hibernateUtil.closeHibernateSession();
		
		return true;
	}

	
	
	
	
	
}
