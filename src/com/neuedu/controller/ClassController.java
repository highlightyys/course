package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neuedu.po.TbClass;
import com.neuedu.service.ClassService;

@Controller
@RequestMapping("/class")
public class ClassController {
	
	@Autowired
	private ClassService classService;
	
	@RequestMapping("/list")
	public String list(HttpSession session,Model model) {
		
		List<TbClass> list = classService.getList();
		model.addAttribute("list", list);
			 	
		return "admin/classManager";
	}
	
	
	/**
	 * ת�����ض���
	 * 	redirect:
	 * forward:
	 * 
	 * @param tbClass
	 * @return
	 */
	@RequestMapping("/save")
	public String save(HttpSession session,TbClass tbClass,RedirectAttributes attributes) {
		
		classService.save(tbClass);
		attributes.addFlashAttribute("message", "����ɹ�");
		return "redirect:/class/list";
	}
	
	/**
	 * �����Ҫ���ض���ʱ����ǰ̨�������ݣ��ڷ����Ĳ����м���RedirectAttributes attributes��
	 * Ȼ��ͨ��attributes.addFlashAttribute("message", "�༭�ɹ�");���ò������Ϳ�����ǰ��ͨ��EL���ʽ��ȡ
	 * @param tbClass
	 * @param attributes
	 * @return
	 */
	
	@RequestMapping("/modify")
	public String modify(TbClass tbClass,RedirectAttributes attributes) {
		classService.modify(tbClass);
		attributes.addFlashAttribute("message", "�༭�ɹ�");
		return "redirect:/class/list";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer classid,RedirectAttributes attributes) {
		
		classService.delete(classid);
		attributes.addFlashAttribute("message", "ɾ���ɹ�");
		return "redirect:/class/list";
	}
	
	

}
