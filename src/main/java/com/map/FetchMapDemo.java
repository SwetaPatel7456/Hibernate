package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchMapDemo {

	
	public static void main(String args[]) {
        System.out.println( "Hello World!" ); 
        
        Configuration cfg = new  Configuration(); 
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();//in jdbc we use connection using this we get prepared statement etc
        //In this using SessionFactory acts as a connection using this we can make sessions.
        //For one project there should be only one sessionfactory.Session factory is a inteface 
        
        
        Session s = factory.openSession();
        Transaction t =  s.beginTransaction();
        
        Question q = (Question)s.get(Question.class, 1);
        		System.out.println(q.getQuestion())		;
        for(Answer a : q.getAnswers()) 
        {
        	System.out.println(a.getAnswer());
        }		
        
        
        t.commit();
        s.close();
        
        
        
	}
}
