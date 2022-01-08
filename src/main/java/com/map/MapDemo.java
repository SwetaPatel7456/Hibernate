package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println( "Hello World!" );
        
        Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating question
        Question q = new Question(); 
        q.setQuestionId(1);
        q.setQuestion("what is java");
        
        
        
        // creating answer
        Answer ans = new Answer();
        ans.setAnsweId(342);
        ans.setAnswer("java is a programming language");
        ans.setQuestion(q);
        
        
     
        
        // creating answer
        Answer ans1 = new Answer();
        ans1.setAnsweId(349);
        ans1.setAnswer("with the help of java we can create  software");
        ans1.setQuestion(q);
        
        List<Answer > a = new ArrayList<Answer>();
        a.add(ans);
        a.add(ans1);
        
        
        q.setAnswers(a);
        
        
        Session session = factory.openSession();
        
        Transaction tx =  session.beginTransaction();
        
        session.save(q);
        session.save(ans);
        session.save(ans1);
        
        
        System.out.println("done");
        tx.commit();
        
        session.close();
        
	}

}
