package com.techelevator;

import com.techelevator.dao.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping("/filmList")
    public String showFilmSearchForm() {
        return "filmList";
    }
    
    @RequestMapping("/filmList/results")
    public String searchFilms(@RequestParam String genre, @RequestParam int minLength, 
    		@RequestParam int maxLength, ModelMap modelHolder) {
    	modelHolder.addAttribute("films", filmDao.getFilmsBetween(genre, minLength, maxLength));
    	modelHolder.addAttribute("categories", filmDao.getAllCategories());
        return "filmList";
    }
    
    
}