package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Student s = new Student();
        
        s.setId(8);
        s.setName("Durgesh");
        s.setCity("delhi");
        
        
        Certificate certi = new Certificate();
        certi.setCourse("android");
        certi.setDuration("2 month");
        s.setCerti(certi);
        
        Student s1 = new Student();
        
        s1.setId(566);
        s1.setName("Reeta");
        s1.setCity("Bombay");
        
        
        Certificate certi1 = new Certificate();
        certi1.setCourse("java");
        certi1.setDuration("3 month");
        s1.setCerti(certi1);
        
        
        Transaction tx = session.beginTransaction();
        
        
        session.save(s);
        session.save(s1);
        
        tx.commit();
        session.close();
        //factory.close();
        

	}

}
