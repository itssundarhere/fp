package com.vehicle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution extends Vehicle {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler two = new TwoWheeler();
		two.setVehicleName("Bike");
		two.setStearingHandle("Bike Stearing");
		
		FourWheeler four = new FourWheeler();
		four.setVehicleName("Astron Martin");
		four.setStearingWheel("Power Steering");
		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();

	}

}
