package org.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public StandardServiceRegistryBuilder serviceregistryBuilder;
	public MetadataSources metaDataSources;
	public Metadata metaData;
	public SessionFactory sessionFactory;
	public Session session;

	public Session getHibernateSession() {
		Configuration configuration = new Configuration().configure();
		
		serviceregistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		metaDataSources = new MetadataSources();
		
		metaData = metaDataSources.buildMetadata(serviceregistryBuilder.build());
		
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
		session = sessionFactory.openSession();
		
		return session;
	}

	public void closeHibernateSession() {
		session.close();
	}
}
