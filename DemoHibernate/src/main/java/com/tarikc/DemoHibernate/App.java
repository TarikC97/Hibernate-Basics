package com.tarikc.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student std = new Student();
        std.setId(1);
        std.setName("Tarik");
        std.setSurname("Curic");
        
        Configuration config = new Configuration();
        SessionFactory sessionfactory = config.buildSessionFactory();
        Session session = sessionfactory.openSession();
        session.persist(std);
    }
}
