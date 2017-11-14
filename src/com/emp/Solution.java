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
		int i = 0;
		while (i < 3) {
			i++;
			session.beginTransaction();
			System.out.print("Enter name:");
			String name = bf.readLine();
			System.out.println("Enter email:");
			String emailId = bf.readLine();
			System.out.println("Enter Phone no:");
			long phone = Long.valueOf(bf.readLine());
			System.out.println("Basicpay:");
			double basicPay = Double.valueOf(bf.readLine());
			System.out.println("HRA:");
			float houseRentAllowance = Float.valueOf(bf.readLine());
			float providentFund = Float.valueOf(bf.readLine());
			Employee employee = new Employee(name, emailId, phone, basicPay, houseRentAllowance, providentFund);
			System.out.println(employee.getName() + " " + employee.getEmailId() + " " + employee.getPhone()
					+ employee.getBasicPay() + " " + employee.getHouseRentAllowance() + " "
					+ employee.getProvidentFund());
			session.save(employee);
			session.getTransaction().commit();
		}
		session.close();
		System.exit(0);
	}

}
