package com.artisan.formTagLibrary.radioButton;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LittleArtisanController {

	@RequestMapping(value = "/littleArtisan", method = RequestMethod.GET)
	public ModelAndView littleArtisan() {
		return new ModelAndView("formTagLibrary/radioButton/littleArtisan",
				"command", new LittleArtisan());
	}

	@RequestMapping(value = "/addLittleArtisan", method = RequestMethod.POST)
	public String addLittleArtisan(
			@ModelAttribute("springmvc") LittleArtisan artisan, ModelMap map) {

		map.addAttribute("name", artisan.getName());
		map.addAttribute("gender", artisan.getGender());

		return "formTagLibrary/radioButton/littleArtisanInfo";
	}

}
