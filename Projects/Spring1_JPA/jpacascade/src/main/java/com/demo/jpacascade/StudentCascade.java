package com.demo.jpacascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpacascade.entity.Student;
import com.demo.jpacascade.entity.Subject;

public class StudentCascade 
{
	  public static void main( String[ ] args ) {  
          
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
            
          EntityManager em = emf.createEntityManager( );  
        em.getTransaction().begin();  
  
           
          Student s1=new Student();  
          s1.setS_id(101);  
          s1.setS_name("Vipul");  
          s1.setS_age(20);  
            
          Student s2=new Student();  
          s2.setS_id(102);  
          s2.setS_name("Aman");  
          s2.setS_age(22);  
            
          Subject sb1=new Subject();  
          sb1.setName("ENGLISH");  
          sb1.setMarks(80);  
            sb1.setId(s1.getS_id());  
              
            Subject sb2=new Subject();  
          sb2.setName("Maths");  
          sb2.setMarks(75);  
              sb2.setId(s2.getS_id());  
            
          s1.setSub(sb1);  
          s2.setSub(sb2);  
            
              
            
          em.persist( s1 );//No need to perform persist operation separately for different entities.  
          em.persist(s2);  
          
          em.getTransaction().commit();  
  
          em.close( );  
          emf.close( );  
          
          
    }  
  
      
}

