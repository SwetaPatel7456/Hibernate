package com.map1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        String query = "from Student";
        Query q = (Query)session.createQuery(query);
        
        List<Student> student  = q.list();     
        
        for(Student s :student) {
        	System.out.println(s.getName());
        }
        String s1  = "from Student s  where s.name='Geeta'";
        Query q1 = (Query)session.createQuery(s1);
        List<Student> list = q1.list();
        for(Student s :list) {
        	System.out.println(s);
         }
	}
}

