package br.exercise.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

import br.exercise.bean.Movies;

public class MovieDao {
	
	
	public boolean save(Movies Movies) {
		
		EntityManagerFactory emf= null;
		EntityManager em=null;
		try {
			
		
		emf=Persistence.createEntityManagerFactory("Exercise4All");
		em=emf.createEntityManager();
		
		em.persist(Movies);
		
		em.getTransaction().commit();
		
		
		} catch (Exception e) {
			return false;
		}finally {
			em.close();
			emf.close();
		
		}
		return true;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Movies> listMovies() {
		EntityManagerFactory emf= null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("Exercise4All");
		em=emf.createEntityManager();
		
		StringBuilder hql = new StringBuilder();
        hql.append("select new Movies( m.movie_id,m.title, m.qtd_copy ) from movies m  where m.qtd_copy>0");

        Query query = (Query) em.createQuery(hql.toString());
 
        em.close();
  		emf.close();
        return query.getResultList();
		
	}
	
	
	public List<Movies> listMovieByTiltle(String title) {
		EntityManagerFactory emf= null;
		EntityManager em=null;
		
		emf=Persistence.createEntityManagerFactory("Exercise4All");
		em=emf.createEntityManager();
		
		StringBuilder hql = new StringBuilder();
        hql.append("select new Movies( m.movie_id,m.title, m.qtd_copy ) from movies m  where m.title:=titleMovie");

        Query query = (Query) em.createQuery(hql.toString());
        query.setParameter("titleMovie", title);
	
        
        em.close();
		emf.close();
		
		return query.getResultList();
	
	}
	
	

}
