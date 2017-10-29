package com.artisan.formHandling.staticPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPageController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index(){
		return "formHandling/staticPages/home";
	}

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect2StaticPage(){
		return "redirect:/resources/final.html";
	}

}
