package org.gorcery.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {

		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Item item = session.get(Item.class, 2);
		System.out.println("Id :" +item.getId());
		System.out.println("Name :"+item.getName());
		System.out.println("Quantity :"+item.getQuantity());
		System.out.println("Price :"+item.getPrice());
		
		session.beginTransaction();
		item.setName("upasaaa");
		item.setPrice(20000);
		session.update(item);
		session.getTransaction().commit();
		System.out.println("update");
		session.close();
		
		Session session1 = sf.openSession();
		
		session1.beginTransaction();
		session1.delete(item);
		session1.getTransaction().commit();
		System.out.println("Deleted");
		session1.close();
	}

}
