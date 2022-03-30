package fr.eni.movielibraryspaghetti.service.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.movielibraryspaghetti.bo.Artist;
import fr.eni.movielibraryspaghetti.bo.Film;
import fr.eni.movielibraryspaghetti.bo.Genre;
import fr.eni.movielibraryspaghetti.service.FilmService;

@Service
@Profile("dev")
public class FilmServiceMock implements FilmService {

	private static List<Genre> lstGenres;
	private static List<Artist> lstArtists;
	private static List<Film> lstFilms;

	@Autowired
	public FilmServiceMock() {
		lstGenres = new ArrayList<>();
		lstGenres.add(new Genre(1, "Animation"));
		lstGenres.add(new Genre(2, "Sci-Fi"));
		lstGenres.add(new Genre(3, "Documentary"));
		lstGenres.add(new Genre(4, "Action"));
		lstGenres.add(new Genre(5, "Comedy"));
		lstGenres.add(new Genre(6, "Drama"));

		lstArtists = new ArrayList<>();
		//Actors
		lstArtists.add(new Artist(1, "Goldblum", "Jeff"));
		lstArtists.add(new Artist(2, "Neil", "Sam"));
		lstArtists.add(new Artist(3, "Dern", "Laura"));
		//Directors
		lstArtists.add(new Artist(4, "Speilberg", "Steven"));
		lstArtists.add(new Artist(5, "Waititi", "Taika"));
		lstArtists.add(new Artist(6, "Johnson", "Ryan"));

		List<Artist> lstArtist1 = new ArrayList<>();
		lstArtist1.add(lstArtists.get(0));
		lstArtist1.add(lstArtists.get(1));
		lstArtist1.add(lstArtists.get(2));

		List<Artist> lstArtist2 = new ArrayList<>();
		lstArtist2.add(lstArtists.get(1));

		List<Artist> lstArtist3 = new ArrayList<>();
		lstArtist3.add(lstArtists.get(2));

		lstFilms = new ArrayList<>();
		lstFilms.add(new Film(
				1,																		//id									
				"Jurassic Park", 														//title
				1993, 																	//year
				128, 																	//duration
				"Dino's go roar!",														//synopsis
				lstArtist1,																//actors
				lstArtists.get(3),														//director
				lstGenres.get(3)));														//genre

		lstFilms.add(new Film(
				2,
				"Hunt for the Wilderpeople",
				2016,
				101,
				"Ricky Baker, a juvenile delinquent who "
				+ "was abandoned by his mother...",
				lstArtist2, 
				lstArtists.get(4),
				lstGenres.get(4)));

		lstFilms.add(new Film(
				3,
				"Star Wars: The Last Jedi",
				2017, 
				152,
				"Shortly after the battle of Starkiller Base, "
				+ "General Leia Organa is leading the Resistance forces in "
				+ "evacuating their base when the First Order fleet arrives...",
				lstArtist3,
				lstArtists.get(5),
				lstGenres.get(1)));

	}

	@Override
	public List<Film> getAllFilms() {
		if (lstFilms == null) {
			return null;
		}
		return lstFilms;
	}

	@Override
	public Film getFilmById(long id) {
		for (Film film : lstFilms) {
			if (film.getId() == id) {
				return film;
			}
		}
		return null;
	}

	@Override
	public List<Genre> getGenres() {
		if (lstGenres == null) {
			return null;
		}
		return lstGenres;
	}

	@Override
	public Genre getGenreById(long id) {
		for (Genre genre : lstGenres) {
			if (genre.getId() == id) {
				return genre;
			}
		}
		return null;
	}

	@Override
	public List<Artist> getArtists() {
		if (lstArtists == null) {
			return null;
		}
		return lstArtists;
	}

	@Override
	public Artist getArtistbyId(long id) {
		for (Artist artist : lstArtists) {
			if (artist.getId() == id) {
				return artist;
			}
		}
		return null;
	}

	@Override
	public void saveFilm(Film film) {
		// TODO Auto-generated method stub
	}

}
