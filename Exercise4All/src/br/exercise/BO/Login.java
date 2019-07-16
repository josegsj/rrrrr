package br.exercise.BO;

import br.exercise.Dao.UserDao;
import br.exercise.bean.User;

public class Login {
	
	public User Login(String login,String password) {
		UserDao userDao=new UserDao();
		User user=userDao.serch(login, password);
		
		if(user!=null) {
			return user;
		}
		
		return null;
	}
	
	public String generete token() {
		
	}

}
