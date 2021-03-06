package com.demo.jpasports;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpasports.entity.Player;
import com.demo.jpasports.entity.Team;

public class ESports 
{
	public static void main(String args[]){
	    EntityManagerFactory emf =     
	        Persistence.createEntityManagerFactory("E_Sports");
	    EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();

	    Team team = new Team();
	    Player p1 = new Player();
	    Player p2 = new Player();
	    Player p3 = new Player();

	    em.persist(team);
	    em.persist(p1);
	    em.persist(p2);
	    em.persist(p3);

	    team.setName("Pickering Atoms");
	    p1.setNickName("Lefty");
	    p1.setTeam(team);
	    p2.setNickName("Kitti");
	    p2.setTeam(team);
	    p3.setNickName("Rikki");
	    p3.setTeam(team);
	    em.getTransaction().commit();
	  }
}
