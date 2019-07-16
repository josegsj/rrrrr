package br.exercise.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.exercise.bean.RentMovie;

public class RentMovieDao {
	
	
public boolean save(RentMovie rentMovie) {
		
		EntityManagerFactory emf= null;
		EntityManager em=null;
		try {
			
		
		emf=Persistence.createEntityManagerFactory("Exercise4All");
		em=emf.createEntityManager();
		
		em.persist(rentMovie);
		
		em.getTransaction().commit();
		
		
		} catch (Exception e) {
			return false;
		}finally {
			em.close();
			emf.close();
		
		}
		return true;
	}

}
