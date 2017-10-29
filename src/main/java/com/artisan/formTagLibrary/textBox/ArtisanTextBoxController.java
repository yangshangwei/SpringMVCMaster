package com.artisan.formTagLibrary.textBox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * @ClassName: ArtisanTextBoxController
 * 
 * @Description: @Controller标注的控制层
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017年10月29日 上午2:02:14
 */

@Controller
public class ArtisanTextBoxController {

	@RequestMapping(value = "/artisanTextBox", method = RequestMethod.GET)
	public ModelAndView artisan() {
		return new ModelAndView("formTagLibrary/textBox/artisan", "command",
				new Artisan());
	}

	@RequestMapping(value = "/addArtisanTextBox", method = RequestMethod.POST)
	public String addArtisan(@ModelAttribute("command") Artisan artisan,
			ModelMap map) {
		map.addAttribute("name", artisan.getName());
		map.addAttribute("age", artisan.getAge());
		map.addAttribute("id", artisan.getId());
		return "formTagLibrary/textBox/result";
	}

}
