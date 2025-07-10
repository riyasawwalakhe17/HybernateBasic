package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class GetDataByIdMain {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//deprecated method  
		//Student st = session.get(Student.class, 3);
		
		Student st = session.find(Student.class, 3);
		System.out.println(st.toString());
		
		transaction.commit();
		session.close();
		
	}
}
