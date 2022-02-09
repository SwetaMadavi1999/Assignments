package com.demo.jpaonetonetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaonetomany.entity.Library;
import com.demo.jpaonetomany.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToManyExample 
{
	  
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
         Library lib1=new Library();  
         //  lib1.setB_id(101);  
           lib1.setB_name("Data Structure");  
            
             
           Library lib2=new Library();  
         //  lib2.setB_id(102);  
           lib2.setB_name("DBMS");  
           
           em.persist(lib1);  
           em.persist(lib2);  
             
           ArrayList<Library> list=new ArrayList<Library>();  
           list.add(lib1);  
           list.add(lib2);  
             
             
             
             
          
          
        Student st1=new Student();  
        // st1.setS_id(1);  
           st1.setS_name("Vipul");  
         //  st1.setBooks_issued(list);  
            st1.setB_issue(list); 
          
           em.persist(st1);  
           
             
        em.getTransaction().commit();  
        em.close();  
        emf.close();  
             
          
          
          
    }}  
      

