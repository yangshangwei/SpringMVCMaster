package com.artisan.formTagLibrary.erros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtisanYController {

	@Autowired
	@Qualifier("artisanYValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = "/artisanY", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("formTagLibrary/errors/artisanY", "artisanY",
				new ArtisanY());
	}

	@ModelAttribute("artisanY")
	public ArtisanY createArtisanModel() {
		return new ArtisanY();
	}

	@RequestMapping(value = "/addArtisanY", method = RequestMethod.POST)
	public String addStudent(
			@ModelAttribute("artisanY") @Validated ArtisanY artisan,
			BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "formTagLibrary/errors/artisanY";
		}

		model.addAttribute("name", artisan.getName());
		model.addAttribute("age", artisan.getAge());
		model.addAttribute("id", artisan.getId());

		return "formTagLibrary/errors/artisanYInfo";
	}

}
