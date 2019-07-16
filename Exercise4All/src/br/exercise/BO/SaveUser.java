package br.exercise.BO;

import br.exercise.Dao.UserDao;
import br.exercise.bean.User;

public class SaveUser {
	
	public boolean save(User user) {
		try {
			UserDao userDao=new UserDao();
			if(user.getLogin()!=null && user.getPassword()!=null && user.getName()!=null) {
				if(validateUserIsTheSame(user)) {
					userDao.save(user);
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	
	public boolean validateUserIsTheSame(User user) {
		UserDao userDao=new UserDao();
		
		User newUder=userDao.serch(user.getLogin(), user.getPassword());
		
		if(newUder!=null) {
			return true;
		}
		return false;
	}
}
