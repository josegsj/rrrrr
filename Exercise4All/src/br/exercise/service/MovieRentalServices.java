package br.exercise.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.exercise.BO.SaveUser;
import br.exercise.bean.Movies;
import br.exercise.bean.User;

@Path("/")
public class MovieRentalServices {
	
	@GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/save")
	public String saveUser(String login,String password,String name) {
		
		try {
		SaveUser saveuser = new SaveUser();
		User user = new User();
		user.setName(name);
		user.setLogin(login);
		user.setPassword(password);
		saveuser.save(user);
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/login")
	public String login(@PathParam("login") String login,@PathParam("password") String password) {
		
	}
	@GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/rentMovies")
	public String rentMovies(@PathParam("token") String token,@PathParam("password") int movieId) {
		
	}
	@GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/giveBackMovies")
	public String giveBackMovies(@PathParam("token")String token,@PathParam("movieId")  int movieId) {
		
	}
	@GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/listMoviesByTitle")
	public List<Movies> listMoviesByTitle(@PathParam("token")String token,@PathParam("title")  String title){
		
	}
	@GET
	 @Produces(MediaType.APPLICATION_JSON)
	 @Path("/listMoviesByqtd")
	public List<Movies> listMoviesByqtd(@PathParam("token")String token){
		
	}

}
