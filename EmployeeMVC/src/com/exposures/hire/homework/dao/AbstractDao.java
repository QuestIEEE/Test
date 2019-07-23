package com.exposures.hire.homework.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao {
	@Autowired
	SessionFactory factory;
	public Session getSession() {
		return factory.getCurrentSession();
	}
	public void persist(Object obj) {
		getSession().persist(obj);
	}
	public void delete(Object object) {
		getSession().delete(object);
	}
}
