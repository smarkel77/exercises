package com.techelevator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	
	@Autowired
	ReviewDao reviewDao;

	@RequestMapping("/greeting")
	public String displayGreeting(HttpSession session, ModelMap modelHolder) {
		modelHolder.put("allReviews", reviewDao.getAllReviews());
		return "greeting";
	}
	@RequestMapping(path="reviewForm", method=RequestMethod.GET)
	public String displayReviewForm() {
		return "reviewForm";
	}
	
	@RequestMapping(path="/reviewForm", method=RequestMethod.POST)
	public String submitReviewForm(@RequestParam String username, @RequestParam int rating, 
									@RequestParam String title, @RequestParam String text) {
		Review review = new Review();
		review.setUsername(username);
		review.setRating(rating);
		review.setTitle(title);
		review.setText(text);
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		
		return "redirect:/reviewSubmitted";
	}
	
	@RequestMapping("/reviewSubmitted")
	public String displayReviewSubmitted() {
		return "reviewSubmitted";
	}
}
