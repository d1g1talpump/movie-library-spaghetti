package fr.eni.movielibraryspaghetti.mmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import fr.eni.movielibraryspaghetti.bo.Artist;
import fr.eni.movielibraryspaghetti.bo.Film;
import fr.eni.movielibraryspaghetti.service.FilmService;

@Controller
@RequestMapping("/films")
public class FilmController {

	private FilmService filmService;
	
	@Autowired
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}

	@GetMapping
	private String getAllFilms(Model model) {
		List<Film> lstFilms = filmService.getAllFilms();
		if (lstFilms == null) {
			lstFilms = new ArrayList<Film>();
		}
		
		model.addAttribute("lstFilms", lstFilms);
		return "view-films";
	}

	@GetMapping("/details")
	public String detailsFilm(@RequestParam(name="id", required=true) int idFilm, Model model) {
		Film film = filmService.getFilmById(idFilm);
		model.addAttribute("film", film);

		//This is poop
//		StringBuilder builder = new StringBuilder();
//		for (Artist actor: film.getActors()) {
//			builder.append("- ");
//			builder.append(actor.getFirstName());
//			builder.append(" ");
//			builder.append(actor.getLastName());
//			builder.append("\n");
//			builder.append("\n");
//		}
//		String lstActors = builder.toString();
//		model.addAttribute("lstActors", lstActors);
		
		return "view-film-details";
	}
}
