package fr.eni.movielibraryspaghetti.service;

import java.util.List;

import fr.eni.movielibraryspaghetti.bo.Artist;
import fr.eni.movielibraryspaghetti.bo.Film;
import fr.eni.movielibraryspaghetti.bo.Genre;

public interface FilmService {

	List<Film> getAllFilms();

	Film getFilmById(long id);

	List<Genre> getGenres();

	Genre getGenreById(long id);

	List<Artist> getArtists();

	Artist getArtistbyId(long id);

	void saveFilm(Film film);
}
