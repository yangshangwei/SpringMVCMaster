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
	 * @Description: ���������http://localhost:8080/springmvc/index����ת��index.jspҳ��
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
	 * @Description: ���jsp�б��İ�ť������action������redirectPage������Ȼ����ת��finalPage
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
