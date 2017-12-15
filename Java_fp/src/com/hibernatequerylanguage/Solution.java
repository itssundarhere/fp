package com.hibernatequerylanguage;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Solution {
	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query<User> query = session.createQuery("from User");
		List<User> list = query.getResultList();
		System.out.println("List size"+list.size());
	}
}
