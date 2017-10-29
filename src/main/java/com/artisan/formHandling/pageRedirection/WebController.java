package com.artisan.formHandling.pageRedirection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	/**
	 * 
	 * 
	 * @Title: index
	 * 
	 * @Description: 浏览器输入http://localhost:8080/springmvc/index，跳转到index.jsp页面
	 * 
	 * @return
	 * 
	 * @return: String
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "formHandling/pageRedirection/index";
	}

	/**
	 * 
	 * 
	 * @Title: redirectPage
	 * 
	 * @Description: 点击jsp中表单的按钮，根据action，进入redirectPage方法，然后跳转到finalPage
	 * 
	 * @return
	 * 
	 * @return: String
	 */
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirectPage() {
		return "redirect:finalPage";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "formHandling/pageRedirection/finalWeb";
	}

}
