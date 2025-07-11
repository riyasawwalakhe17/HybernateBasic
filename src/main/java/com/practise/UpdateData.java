package com.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;

public class UpdateData {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, 10);
		s.setFname("Priyanka");
		s.setLname("Karmarkar");
		s.setCity("Mumbai");
		s.setGender("Female");
		

		transaction.commit();
		session.close();

	}
}
