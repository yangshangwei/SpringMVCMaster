package com.artisan.formTagLibrary.ratioButtons;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtisanOneController {

	@RequestMapping(value = "/artisanOne", method = RequestMethod.GET)
	public ModelAndView littleArtisan() {
		return new ModelAndView("formTagLibrary/radioButtons/artisanOne",
				"command", new ArtisanOne());
	}

	@RequestMapping(value = "/addArtisanOne", method = RequestMethod.POST)
	public String addLittleArtisan(
			@ModelAttribute("springmvc") ArtisanOne artisan, ModelMap map) {

		map.addAttribute("name", artisan.getName());
		map.addAttribute("gender", artisan.getGender());
		map.addAttribute("favoriteFood", artisan.getFavoriteFood());

		return "formTagLibrary/radioButtons/artisanOneInfo";
	}
	
	// 同jsp中的 items选项
	@ModelAttribute("foodList")
	public List<String> getFoodList() {
		List<String> foodList = new ArrayList<String>();
		foodList.add("apple");
		foodList.add("bread");
		foodList.add("pear");
		foodList.add("rice");
		return foodList;
	}
}
