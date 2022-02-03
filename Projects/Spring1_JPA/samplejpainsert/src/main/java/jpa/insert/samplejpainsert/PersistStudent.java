package jpa.insert.samplejpainsert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.insert.samplejpainsert.entity.Student_Entity;

public class PersistStudent {

    public static void main( String[] args )
    {
       
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
        Student_Entity s1=new Student_Entity();  
        s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        s1.setS_age(24);  
          
        Student_Entity s2=new Student_Entity();  
        s2.setS_id(102);  
        s2.setS_name("Ronit");  
        s2.setS_age(22);  
          
        Student_Entity s3=new Student_Entity();  
        s3.setS_id(103);  
        s3.setS_name("Rahul");  
        s3.setS_age(26);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close(); 
    }
}
