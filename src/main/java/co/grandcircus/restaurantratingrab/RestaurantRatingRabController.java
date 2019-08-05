package co.grandcircus.restaurantratingrab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.restaurantratingrab.dao.RestaurantDao;
import co.grandcircus.restaurantratingrab.entity.Restaurant;

@Controller
public class RestaurantRatingRabController {
	
	@Autowired
	private RestaurantDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		List<Restaurant> items = dao.findAll();
		return new ModelAndView("index", "items", items);
	}

	
}
