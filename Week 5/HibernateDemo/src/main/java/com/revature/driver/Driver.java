package com.revature.driver;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.revature.beans.Bear;
import com.revature.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		init();
		//BearDAO dao = new BearDAO();
		//System.out.println(dao.getBears());
		//System.out.println(dao.getBearByName("Yogi"));
		//Bear b = new Bear("Baloo", 75, 300);
		//int bearId = dao.saveBear(b);
		//System.out.println(b.toString());
		//System.out.println("Fed bear " + dao.feedBear(bearId, 100));
		//System.out.println(b.toString());
		usingCriteria();
		

	}
	
	static void init() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Bear b1 = new Bear("Winnie", 50, 10);
		Bear b2 = new Bear("Yogi", 25, 400);
		Bear b3 = new Bear("Smokey", 100, 300);
		Bear b4 = new Bear("RevaBear", 2, 600);
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	static void usingCriteria() {
		Session session = HibernateUtil.getSession();
		//List<Bear> bears = session.createCriteria(Bear.class).add(Restrictions.like("name", "B%")).list();
		
		List<Bear> bears = session.createCriteria(Bear.class)
				.add(Restrictions.between("weight", 350, 700))
				.addOrder(Order.asc("weight")).list();
		
		System.out.println(bears.toString());
		
		Criteria criteria = session.createCriteria(Bear.class);
		criteria.setProjection(Projections.rowCount());
		List rowCount = criteria.list();
		System.out.println("Number of Bears = " + rowCount.get(0));
		
	}

}
