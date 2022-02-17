package com.demo.jpqlsample;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.jpqlsample.entity.Students;


public class Jpql_Students 
{
    public static void main( String[] args )
    {
       
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        Students s1=new Students();  
       // s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        s1.setS_age(24);  
          
        Students s2=new Students();  
      // s2.setS_id(102);  
        s2.setS_name("Ronit");  
        s2.setS_age(22);  
          
        Students s3=new Students();  
       // s3.setS_id(103);  
        s3.setS_name("Rahul");  
        s3.setS_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
Query query = em.createNamedQuery("find name");  
	          @SuppressWarnings("unchecked")  
	        List<Students> list =query.getResultList();  
	          System.out.println("Student Name :");  
	          for(Students s:list) {  
	                
	             System.out.println(s.getS_name()+" "+s.getS_age()+" "+s.getS_id());  
	          
	               
	          }  
        emf.close();  
        em.close(); 
    }
} 

