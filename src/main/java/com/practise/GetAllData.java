package com.practise;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class GetAllData {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//hql query 
		//When we use class object that is hql query
		//when use table name that is sql query
		List<Student> studentlist = session.createQuery("select s from Student s", Student.class).getResultList();
		
		studentlist.stream().forEach(k -> System.out.println(k.toString()));
		
		transaction.commit();
		
		session.close();
	}
}
