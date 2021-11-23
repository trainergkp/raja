package com.dxc.HiberHqlPro1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;
import com.dxc.HiberHqlPro1.persist.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "HQL Example" );
        Configuration conf=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=conf.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
//        Employee emp=new Employee();
//        emp.setEmpcode(126);
//        emp.setEmpname("Pankaj");
//        emp.setDesignation("Developer");
//        emp.setBasic(35000);
//        emp.setCity("NOIDA");
//        session.save(emp);
//        t.commit();
//        System.out.println("Done");
//        Query q=session.createQuery("update Employee set empname=:n where empcode=:i");
//        q.setParameter("n", "Sanjeev");
//        q.setParameter("i", 121);
//        q.executeUpdate();
//        t.commit();
        Query q=session.createQuery("select sum(basic) from Employee");
        Query q1=session.createQuery("select avg(basic) from Employee");
        //Query query=session.createQuery("from Employee");
        //query.setFirstResult(2);
        //query.setMaxResults(1);
//        List list=q.list();
//        Iterator<Employee> it=list.iterator();
//        System.out.println("Employee Details");
//        System.out.println(".....................................");
//        int count=0;
//        while(it.hasNext())
//        {
//        	Employee emp=it.next();
//        	System.out.println("Record no. :"+(++count));
//        	System.out.println("Employee code :"+emp.getEmpcode());
//        	System.out.println("Employee name :"+emp.getEmpname());
//        	System.out.println("Designation :"+emp.getDesignation());
//        	System.out.println("Basic :"+emp.getBasic());;
//        	System.out.println("City :"+emp.getCity());
//        	System.out.println("..................................................");
//        }
        Object sumdata=q.getSingleResult();
        System.out.println("Sum of salary :"+sumdata);
        Object avgdata=q1.getSingleResult();
        System.out.println("Average salary :"+avgdata);
    }
}
