package com.artisan.formTagLibrary.textarea;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtisanTextAreaController {
	
	@RequestMapping(value = "/artisanTextArea", method = RequestMethod.GET)
	public ModelAndView artisan() {
		return new ModelAndView("formTagLibrary/textArea/artisan", "command",
				new ArtisanTextArea());
	}
	
	@RequestMapping(value = "/addArtisanTextArea", method = RequestMethod.POST)
	public String addArtisan(@ModelAttribute("springmvc") ArtisanTextArea artisan,
			ModelMap modelMap) {

		modelMap.addAttribute("name", artisan.getName());
		modelMap.addAttribute("password", artisan.getPassword());
		modelMap.addAttribute("adress", artisan.getAddress());

		return "formTagLibrary/textArea/showArtisanInfo";
	}

}
