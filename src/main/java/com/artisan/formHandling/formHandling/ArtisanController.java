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
 * @Description: @Controller��ע�Ŀ��Ʋ�
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017��10��15�� ����4:51:05
 */

@Controller
public class ArtisanController {
	/**
	 * 
	 * 
	 * @Title: artisan
	 * 
	 * @Description: ��jsp��ʹ��Spring��ܱ�ǩform:form���Զ���Model��һ������ֵ����ǰform��ʵ�����
	 *               Ĭ����command���� �������󶨻�Ϳ�����form����ʹ�øö���������ˡ�
	 * 
	 *               Ĭ������£������������������ԡ�command��Ϊ���ŵ�PageContext�У�
	 * 
	 *               �����ͨ����������commandName���Ե�����ʹ������������
	 *               ������������artisan.jsp�н�form��commandName��������Ϊ��artisan������
	 * 
	 *               ��ʱ�����ͨ��<form:form commandName="artisan">��ʽָ���󶨵ı��������ơ�
	 * 
	 * @return
	 * 
	 * @return: ModelAndView ( formHandlingĿ¼�µ�artisan.jsp)
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
	 * @Description: ��ע�ڷ��������ϵ�@ModelAttribute˵���˸÷���������ֵ����model��ȡ�á�
	 * 
	 *               ���model���Ҳ�������ô�ò������ȱ�ʵ���� ,Ȼ����ӵ�model�С�
	 *               ��model�д����Ժ���������������ƥ��Ĳ���������䵽�ò����С�
	 * 
	 *               ����Spring MVC�б���Ϊ���ݰ󶨣� һ���ǳ����õ����ԣ����ǲ���ÿ�ζ��ֶ��ӱ��������ת����Щ�ֶ����ݡ�
	 * 
	 * @param artisan
	 * @param modelMap
	 * 
	 * @return: formHandlingĿ¼�µ�result.jsp
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
