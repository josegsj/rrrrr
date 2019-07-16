package br.exercise.test;

import static org.junit.Assume.assumeNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.exercise.Dao.UserDao;
import br.exercise.bean.User;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class SaveUserTest {

	@Mock
    UserDao userDao;
	
	
	@Test
	public void saveValidatePasswordEqualNull() {
		User user=new User();
		user.setName("teste");
		user.setLogin("teste");
		user.setPassword(null);
		
		
		assumeNotNull(user.getPassword());
	}
	
	
	
	
	@Test
	public void ValidateUserIsTheSameAssertTrue() {
		
		User user=new User();
		user.setLogin("teste");
		user.setPassword("teste123");
		
		User newuser=null;
		newuser=(User) Mockito.when(userDao.serch("teste", "teste123")).thenReturn(user);

		Assert.assertTrue(newuser!=null);
		
	}
	
	
	@Test
	public void ValidateUserIsTheSameAssertFalse() {
		
		User user=new User();
		user.setLogin("teste2");
		user.setPassword("teste123");
		
		User newuser=null;
		newuser=(User) Mockito.when(userDao.serch("teste", "teste123")).thenReturn(user);

		Assert.assertFalse(newuser!=null);
		
	}
	
}
