package br.exercise.test;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.exercise.Dao.UserDao;
import br.exercise.bean.User;


@RunWith(MockitoJUnitRunner.class)
public class LoginTest {
		@Mock
	    UserDao userDao;
	    

	@Test
	public void loginAssertTrue() {
		User user=new User();
		user.setLogin("teste");
		user.setPassword("teste123");
		
		User newuser=null;
		newuser=(User) Mockito.when(userDao.serch("teste", "teste123")).thenReturn(user);

		assumeTrue(newuser!=null);
	}


	
	@Test
	public void loginAssertFalseLoginInvalidate() {
		User user=new User();
		user.setLogin("tes");
		user.setPassword("teste123");
		
		User newuser=null;
		newuser=(User) Mockito.when(userDao.serch("teste", "teste123")).thenReturn(user);

		assumeFalse(newuser!=null);
	}

	
	@Test
	public void loginAssertFalsePasswordInvalidate() {
		User user=new User();
		user.setLogin("teste");
		user.setPassword("teste");
		
		User newuser=null;
		newuser=(User) Mockito.when(userDao.serch("teste", "teste123")).thenReturn(user);

		assumeFalse(newuser!=null);
	}

}
