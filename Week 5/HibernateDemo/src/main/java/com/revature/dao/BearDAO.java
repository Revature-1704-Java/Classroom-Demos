package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.beans.Bear;
import com.revature.util.HibernateUtil;

public class BearDAO {
	
	public List<Bear> getBears() {
		List<Bear> bears = new ArrayList<>();
		Session session = HibernateUtil.getSession();
		bears = session.createQuery("from Bear").list();
		return bears;
	}

}
