package com.artisan.formHandling.formHandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * @ClassName: ArtisanController
 * 
 * @Description: @Controller标注的控制层
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017年10月15日 下午4:51:05
 */

@Controller
public class ArtisanController {
	/**
	 * 
	 * 
	 * @Title: artisan
	 * 
	 * @Description: 在jsp中使用Spring框架标签form:form会自动绑定Model的一个属性值到当前form的实体对象，
	 *               默认是command属性 ，这样绑定会就可以在form表单里使用该对象的属性了。
	 * 
	 *               默认情况下，表单控制器将表单对象以“command”为名放到PageContext中，
	 * 
	 *               你可以通过表单控制器commandName属性的设置使用其它的名字
	 *               （这里我们在artisan.jsp中将form的commandName属性设置为“artisan”），
	 * 
	 *               这时你必须通过<form:form commandName="artisan">显式指定绑定的表单对象名称。
	 * 
	 * @return
	 * 
	 * @return: ModelAndView ( formHandling目录下的artisan.jsp)
	 */
	@RequestMapping(value = "/artisan", method = RequestMethod.GET)
	public ModelAndView artisan() {
		return new ModelAndView("formHandling/artisan", "artisan",
				new Artisan());
	}

	/**
	 * 
	 * 
	 * @Title: addArtisan
	 * 
	 * @Description: 标注在方法参数上的@ModelAttribute说明了该方法参数的值将由model中取得。
	 * 
	 *               如果model中找不到，那么该参数会先被实例化 ,然后被添加到model中。
	 *               在model中存在以后，请求中所有名称匹配的参数都会填充到该参数中。
	 * 
	 *               这在Spring MVC中被称为数据绑定， 一个非常有用的特性，我们不用每次都手动从表格数据中转换这些字段数据。
	 * 
	 * @param artisan
	 * @param modelMap
	 * 
	 * @return: formHandling目录下的result.jsp
	 */

	@RequestMapping(value = "/addArtisan", method = RequestMethod.POST)
	public String addArtisan(@ModelAttribute("artisan") Artisan artisan,
			ModelMap modelMap) {
		modelMap.addAttribute("age", artisan.getAge());
		modelMap.addAttribute("name",artisan.getName());
		modelMap.addAttribute("id", artisan.getId());
		return "formHandling/result";
	}

}
