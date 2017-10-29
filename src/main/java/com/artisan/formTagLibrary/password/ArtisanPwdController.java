package com.artisan.formTagLibrary.password;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtisanPwdController {
	
	@RequestMapping(value = "/artisanPwd", method = RequestMethod.GET)
	public ModelAndView artisan() {
		return new ModelAndView("formTagLibrary/password/artisan", "command",
				new ArtisanPwd());
	}
	
	@RequestMapping(value = "/addArtisanPwd", method = RequestMethod.POST)
	public String addArtisan(@ModelAttribute("springmvc") ArtisanPwd artisan,
			ModelMap modelMap) {

		modelMap.addAttribute("name", artisan.getName());
		modelMap.addAttribute("password", artisan.getPassword());

		return "formTagLibrary/password/showArtisanInfo";
	}

}
