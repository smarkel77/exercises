package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path= {"/homePage", "/"}, method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping(path="/newUser", method=RequestMethod.GET)
	public String displayNewUser(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("newUser")) {
			modelHolder.put("newUser", new Registration());
		}
		return "newUser";
	}

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path="/newUser", method=RequestMethod.POST)
	public String processNewUserForm(@Valid @ModelAttribute Registration newUser, BindingResult result,
			RedirectAttributes flash) {
		
		flash.addFlashAttribute("newUser", newUser);

		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "newUser", result);
			return "redirect:/newUser";
		}
		return "redirect:confirmation";
	}

	// GET: /login
	// Return the empty login view
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String displayLogin(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("login")) {
			modelHolder.put("login", new Login());
		}
		return "login";
	}

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String processLoginForm(@Valid @ModelAttribute Login login, BindingResult result,
			RedirectAttributes flash) {
		
		flash.addFlashAttribute("login", login);

		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
			return "redirect:/login";
		}
		return "redirect:confirmation";
	}

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
	public String displayConfirmation() {
		return "confirmation";
	}
	
}
