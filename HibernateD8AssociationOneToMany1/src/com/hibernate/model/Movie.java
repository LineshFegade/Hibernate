package com.hibernate.model;

import java.sql.Date;
import javax.persistence.*;
@Entity
@Table(name="hib_movieinfo")
public class Movie {
	@Id
	@Column(name="movieId")
	@GeneratedValue
	private int movieId; 							//(movieId must be auto generated)
	@Column(name="movie_Name")
	private String movieName;
	@Column(name="ReleaseDate")
    private Date releaseDate;
	@Column(name="Budget")
    private long budget;
    @ManyToOne
    @JoinColumn(name="f_movieid")
	private Director dir;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String movieName, Date releaseDate, long budget, Director dir) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.dir = dir;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public Director getDir() {
		return dir;
	}
	public void setDir(Director dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", budget="
				+ budget + ", dir=" + dir + "]";
	}
	
}
