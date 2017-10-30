package com.artisan.formTagLibrary.hidden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherController {

	@RequestMapping(value = "/teacher", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("formTagLibrary/hidden/teacher", "command",
				new Teacher());
	}

	@RequestMapping(value = "/addTeacher", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Teacher teacher,
			ModelMap model) {
		model.addAttribute("name", teacher.getName());
		model.addAttribute("age", teacher.getAge());
		model.addAttribute("id", teacher.getId());

		return "formTagLibrary/hidden/teacherInfo";
	}
}
