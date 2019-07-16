package br.exercise.BO;

import br.exercise.Dao.GiveBackMovieDao;
import br.exercise.bean.GiveBackMovie;

public class SaveGiveBackMovie {
	
	
	public boolean save(GiveBackMovie giveBackMovie) {
		GiveBackMovieDao giBackMovieDao = new GiveBackMovieDao();
		giBackMovieDao.save(giveBackMovie);
		return true;
	}

}
