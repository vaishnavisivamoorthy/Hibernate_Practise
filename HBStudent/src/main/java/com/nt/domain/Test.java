package com.nt.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		//config.addAnnotatedClass(Student.class);
		System.out.println("Success");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction trans =session.beginTransaction();
		Student std = new Student();
		std.setId(002);
		std.setName("Dharshana");
		trans.commit();
		session.close();
		System.out.println("Record Added Successfully ");

	}

}
