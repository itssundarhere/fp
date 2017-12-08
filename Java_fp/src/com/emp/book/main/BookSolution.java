package com.emp.book.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.emp.book.Book;

public class BookSolution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Book id:");
		int id = Integer.valueOf(bf.readLine());
		System.out.println("Book name:");
		String name = String.valueOf(bf.readLine());
		System.out.println("Publisher name:");
		String publisher = String.valueOf(bf.readLine());
		System.out.println("Author name:");
		String author = String.valueOf(bf.readLine());
		System.out.println("Book price:");
		double price = Double.valueOf(bf.readLine());
		System.out.println("Published date:");
		Date published = new  Date(bf.readLine());
		System.out.println("ISBN number:");
		String isbnNumber = String.valueOf(bf.readLine());
		Book book = new Book(id,name,publisher,author,price,published,isbnNumber);
		System.out.println("id:"+book.getId()+" name:"+book.getName());
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

}
