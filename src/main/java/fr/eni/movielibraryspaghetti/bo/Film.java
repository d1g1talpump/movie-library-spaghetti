package fr.eni.movielibraryspaghetti.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Film {

	// Class Attributes
	private long id;
	private String title;
	private int year;
	private int duration;
	private String synopsis;
	// Associations
	private List<Artist> actors;
	private Artist director;
	private List<Review> reviews;
	private Genre genre;

	public Film() {
		actors = new ArrayList<Artist>();
		reviews = new ArrayList<Review>()
;	}
	
	/**
	 * 
	 * @param id
	 * @param title
	 * @param year
	 * @param duration
	 * @param synopsis
	 * @param actors
	 * @param director
	 * @param genre
	 */
	public Film(long id, String title, int year, int duration, String synopsis, List<Artist> actors, Artist director, Genre genre) {
		this();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
		this.actors = actors;
		this.director = director;
		this.genre = genre;
	}

	/**
	 * Film constructor
	 * @param id
	 * @param title
	 * @param year
	 * @param duration
	 * @param synopsis
	 * @param actors
	 * @param director
	 * @param reviews
	 * @param genre
	 */
	public Film(long id, String title, int year, int duration, String synopsis, List<Artist> actors, Artist director,
			List<Review> reviews, Genre genre) {
		this();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
		this.actors = actors;
		this.director = director;
		this.reviews = reviews;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public List<Artist> getActors() {
		if (actors == null) {
			return null;
		}
		return actors;
	}

	public void setActors(List<Artist> actors) {
		this.actors = actors;
	}

	public Artist getDirector() {
		return director;
	}

	public void setDirector(Artist director) {
		this.director = director;
	}

	public List<Review> getReviews() {
		if (reviews == null) {
			return null;
		}
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", year=" + year + ", duration=" + duration + ", synopsis="
				+ synopsis + ", actors=" + actors + ", director=" + director + ", reviews=" + reviews + ", genre="
				+ genre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(actors, director, duration, genre, id, reviews, synopsis, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Objects.equals(actors, other.actors) && Objects.equals(director, other.director)
				&& duration == other.duration && Objects.equals(genre, other.genre) && id == other.id
				&& Objects.equals(reviews, other.reviews) && Objects.equals(synopsis, other.synopsis)
				&& Objects.equals(title, other.title) && year == other.year;
	}
	
	
}
