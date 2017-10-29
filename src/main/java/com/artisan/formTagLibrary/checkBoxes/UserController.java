package com.artisan.formTagLibrary.checkBoxes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("formTagLibrary/checkBoxes/user", "command",
				new User());
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("springmvc") User user,
			ModelMap modelMap) {

		modelMap.addAttribute("username", user.getUsername());
		modelMap.addAttribute("password", user.getPassword());
		modelMap.addAttribute("address", user.getAddress());
		modelMap.addAttribute("receivePaper", user.isReceivePaper());
		modelMap.addAttribute("favoriteFrameworks",
				user.getFavoriteFrameworks());

		return "formTagLibrary/checkBoxes/userInfo";
	}

	@ModelAttribute("frameworkList")
	public List<String> getFrameworkList() {
		List<String> frameworkList = new ArrayList<String>();
		frameworkList.add("Spring MVC");
		frameworkList.add("Spring");
		frameworkList.add("Mybatis");
		frameworkList.add("Hibernate");
		return frameworkList;
	}
}
