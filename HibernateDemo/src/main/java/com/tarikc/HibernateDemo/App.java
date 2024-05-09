package com.tarikc.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop lap = new Laptop();
        lap.setLid(115);
        lap.setLapname("Lenovo");
//        Name nam = new Name();
//        nam.setFname("Asija");
//        nam.setMname("Mirso");
//        nam.setLname("Fijuljanin");
        Student stud = new Student();
        stud.setId(3);
        stud.setName("Tarik");
        stud.setSurname("Curic");
        //Adding object to the list       
        stud.getLaptop().add(lap);
        lap.getStudent().add(stud);
        //Fetch Eager,Lazy
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessfactory = config.buildSessionFactory();
        Session session = sessfactory.openSession();
        Transaction tran = session.beginTransaction();
        session.persist(lap);
        session.persist(stud);
//        stud = (Student)session.get(Student.class, 1);
        tran.commit();
        
        System.out.println(stud);
        
        
    }
}
