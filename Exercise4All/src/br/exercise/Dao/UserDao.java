package br.exercise.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import br.exercise.bean.User;

public class UserDao {
	
	  private static SessionFactory factory; 
	
	public boolean save(User user) {
		
		EntityManagerFactory emf= null;
		EntityManager em=null;
		try {
			
		
		emf=Persistence.createEntityManagerFactory("Exercise4All");
		em=emf.createEntityManager();
		
		em.persist(user);
		
		em.getTransaction().commit();
		
		
		} catch (Exception e) {
			return false;
		}finally {
			em.close();
			emf.close();
		
		}
		return true;
	}
	
	@SuppressWarnings("deprecation")
	public User serch(String login,String password) {
		 Session session =factory.openSession() ;
		Criteria crit =session.createCriteria(User.class);
		crit.add(Restrictions.eq("login",login));
		crit.add(Restrictions.eq("password",password));
		 return (User) crit.list();
	}
	

}
