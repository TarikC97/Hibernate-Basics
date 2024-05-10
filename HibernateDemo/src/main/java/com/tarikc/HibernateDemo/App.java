package com.tarikc.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Laptop lap = new Laptop();
//        lap.setLid(115);
//        lap.setLapname("Lenovo");
////        Name nam = new Name();
////        nam.setFname("Asija");
////        nam.setMname("Mirso");
////        nam.setLname("Fijuljanin");
//        Student stud = new Student();
//        stud.setId(3);
//        stud.setName("Tarik");
//        stud.setSurname("Curic");
//        //Adding object to the list       
//        stud.getLaptop().add(lap);
//        lap.getStudent().add(stud);
//        //Fetch Eager,Lazy
//        
//        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//        SessionFactory sessfactory = config.buildSessionFactory();
//        Session session = sessfactory.openSession();
//        Transaction tran = session.beginTransaction();
//        session.persist(lap);
//        session.persist(stud);
////        stud = (Student)session.get(Student.class, 1);
//        tran.commit();
//        
//        System.out.println(stud);
    		Alien al = null;
//    		al.setAid(4);
//    		al.setName("Fourth");
//    		al.setColor("Blue");
    	
    	   Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
           SessionFactory sessfactory = config.buildSessionFactory();
           Session session1 = sessfactory.openSession();
           Transaction tran = session1.beginTransaction();

           Query que1 = session1.createQuery("from Alien where aid=1");  
           que1.setCacheable(true);
//           session1.persist(al);
           al = (Alien)que1.uniqueResult();
           System.out.println(al);
           tran.commit();
           session1.close();
           
           Session session2 = sessfactory.openSession();
           tran = session2.beginTransaction();
           
           Query que2 = session2.createQuery("from Alien where aid=1");
           que2.setCacheable(true);
           //al = (Alien)session2.get(Alien.class, 1);
           al = (Alien)que2.uniqueResult();
           System.out.println(al);
        
           tran.commit();
           session2.close();
           
        
        
    }
}
