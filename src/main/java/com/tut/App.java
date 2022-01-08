package com.tut;

import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        
        //create new student
        
        Student st = new Student();
        st.setId(17);
        st.setName("Geeta");
        st.setCity("Goa");
        System.out.println(st);
        
        Address ad = new  Address();
        //ad.setAdresssId(35);
        ad.setStreet("street2");
        ad.setCity("bangal");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        
        //read image using file inputstream
        
        FileInputStream fis = new FileInputStream("src/main/java/PANCARD.jpeg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        
        Transaction tx =  session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        System.out.println("done");
        tx.commit();
        
        session.close();
    }
}
