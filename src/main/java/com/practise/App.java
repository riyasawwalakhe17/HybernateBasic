package com.practise;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practise.Entity.Student;
import com.practise.Utility.HibernateUtility;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student();
    	s1.setId(15);
    	s1.setFname("Devyani");
    	s1.setLname("Thakre");
    	s1.setGender("Female");
    	s1.setCity("Amravati");
    	s1.setMobileno(1234567891);
    	
    	Student s2 = new Student();
    	s2.setId(16);
    	s2.setFname("Poonam");
    	s2.setLname("Satao");
    	s2.setGender("Female");
    	s2.setCity("Pune");
    	s2.setMobileno(1234567894);
    	
    	Student s3 = new Student();
    	s3.setId(10);
    	s3.setFname("Prachi");
    	s3.setLname("Yadav");
    	s3.setGender("Female");
    	s3.setCity("Pune");
    	s3.setMobileno(123456784);
    	
    	List<Student> studentlist = Arrays.asList(s1,s2,s3);
    	
    	//1.session factory
    	SessionFactory factory = HibernateUtility.getSessionFactory();
    	//2.session from session factory
    	Session session = factory.openSession();
    	//3.transaction from session
    	//Transaction transaction = session.beginTransaction();
    	
    	//part 1
    	//to save single object
    	
//    	//4.save process
//    	session.persist(s);
//    	//5.pass to database
//    	transaction.commit();
    	
    	//part 2
    	//to save list of student
    	for(Student stu : studentlist) {
    		Transaction transaction = session.beginTransaction();
    		session.persist(stu);
    		transaction.commit();
    	}
    	
    	//session closed
    	session.close();
    	
    }
}
