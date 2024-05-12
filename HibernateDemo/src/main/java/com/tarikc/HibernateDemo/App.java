package com.tarikc.HibernateDemo;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;

import net.sf.ehcache.search.expression.Criteria;

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
//    		Alien al = null;
//    		al.setAid(4);
//    		al.setName("Fourth");
//    		al.setColor("Blue");
    	
    	   Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
           SessionFactory sessfactory = config.buildSessionFactory();
           Session session1 = sessfactory.openSession();
           Transaction tran = session1.beginTransaction();
           
           //Native Queries in Hibernate(Sql use in hibernate)
           NativeQuery query2 = session1.createNativeQuery("select name,marks from student where marks>90");
//           query2.addEntity(Student.class);
//           query2.setResultTransformer(null);
           List students = query2.list();
           for(Object obj: students) {
        	   Map<String,Object> map = (Map)obj;
        	   
        	   System.out.println(map.get("name")+":"+map.get("marks"));
           }
//           Random rand = new Random();
//           for(int i=1;i<=50; i++) {
//        	   Student stud = new Student();
//        	   stud.setId(i);
//        	   stud.setName("Name "+i);
//        	   stud.setMarks(rand.nextInt(100));
//        	   session1.persist(stud);
//           }
//           int num = 90;
//           Query<Object> query1 = session1.createQuery("select sum(marks) from Student where marks>:num");
////           List<Student> students = query1.list();
//           query1.setParameter("num", num);
//           Object marks = (Object) query1.uniqueResult();
//        		   
////           for(Object mark:marks) {
//        	   System.out.println("Sum of marks:"+marks);
////           }
           tran.commit();

//           Query que1 = session1.createQuery("from Alien where aid=1");  
//           que1.setCacheable(true);
////           session1.persist(al);
//           al = (Alien)que1.uniqueResult();
//           System.out.println(al);
//           tran.commit();
//           session1.close();
//           //HQL
//           Session session2 = sessfactory.openSession();
//           tran = session2.beginTransaction();
//           
//           Query que2 = session2.createQuery("from Alien where aid=1");
//           que2.setCacheable(true);
//           //al = (Alien)session2.get(Alien.class, 1);
//           al = (Alien)que2.uniqueResult();
//           System.out.println(al);
//        
//           tran.commit();
//           session2.close();
           
        
        
    }
}
