package com.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.emp.sample.Employee;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id:");
		int id=Integer.valueOf(bf.readLine());
		System.out.print("Enter name:");
		String name=bf.readLine();
		System.out.println("Enter email:");
		String emailId=bf.readLine();
		System.out.println("Enter Phone no:");
		long phone=Long.valueOf(bf.readLine());
		
		Employee employee = new Employee(id, name, emailId, phone);
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getEmailId()+" "+employee.getPhone());
		session.close();
		System.exit(0);
	}

}
