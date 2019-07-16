package br.exercise.BO;

import br.exercise.Dao.RentMovieDao;
import br.exercise.bean.RentMovie;

public class RentMovieBO {
	
	
	public boolean save(RentMovie rentMovie) {
		RentMovieDao rentMovieDao = new RentMovieDao();
		rentMovieDao.save(rentMovie);
		return true;
	}

}
