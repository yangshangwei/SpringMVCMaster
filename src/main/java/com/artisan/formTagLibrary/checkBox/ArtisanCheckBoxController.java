package com.artisan.formTagLibrary.checkBox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * @ClassName: ArtisanCheckBoxController
 * 
 * @Description: @Controller标注的控制层
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017年10月29日 上午5:24:53
 */

@Controller
public class ArtisanCheckBoxController {

	@RequestMapping(value = "/artisanCheckBox", method = RequestMethod.GET)
	public ModelAndView artisan() {
		return new ModelAndView("formTagLibrary/checkBox/artisan", "command",
				new ArtisanCheckBox());
	}
	
	@RequestMapping(value="/addArtisanCheckBox",method =RequestMethod.POST)
	public String addArtisan(
			@ModelAttribute("springmvc") ArtisanCheckBox artisan,
			ModelMap modelMap) {
		
		modelMap.addAttribute("name", artisan.getName());
		modelMap.addAttribute("password", artisan.getPassword());
		modelMap.addAttribute("isNotified", artisan.isNotify());
		
		return "formTagLibrary/checkBox/showArtisanInfo";
	}

}
