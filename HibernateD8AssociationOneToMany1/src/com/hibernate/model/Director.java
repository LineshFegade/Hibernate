package com.hibernate.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="hib_directorinfo")
public class Director {
	@Id
	@Column(name="director_id")
	 private int directorId;
	@Column(name="director_name")
	private String directorName;
	@OneToMany(mappedBy = "dir")
	private Set<Movie> movies;
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Director(int directorId, String directorName, Set<Movie> movies) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.movies = movies;
	}
	public int getDirectorId() {
		return directorId;
	}
	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", movies=" + movies + "]";
	}
	
	

}
