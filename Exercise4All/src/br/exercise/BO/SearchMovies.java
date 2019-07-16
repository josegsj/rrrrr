package br.exercise.BO;

import java.util.List;

import br.exercise.Dao.MovieDao;
import br.exercise.bean.Movies;

public class SearchMovies {
	
	
	public List<Movies> getListMoviesAvailable(){
		MovieDao movieDao= new MovieDao();
		
		return movieDao.listMovies();
	}
	
	
	public List<Movies> getListMoviesByTitle(String title){
		MovieDao movieDao= new MovieDao();
		
		return movieDao.listMovieByTiltle(title);
	}

}
