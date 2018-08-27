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
	 * 转发和重定向
	 * 	redirect:
	 * forward:
	 * 
	 * @param tbClass
	 * @return
	 */
	@RequestMapping("/save")
	public String save(HttpSession session,TbClass tbClass,RedirectAttributes attributes) {
		
		classService.save(tbClass);
		attributes.addFlashAttribute("message", "保存成功");
		return "redirect:/class/list";
	}
	
	/**
	 * 如果想要在重定向时想向前台传递数据，在方法的参数中加入RedirectAttributes attributes，
	 * 然后通过attributes.addFlashAttribute("message", "编辑成功");设置参数，就可以在前端通过EL表达式获取
	 * @param tbClass
	 * @param attributes
	 * @return
	 */
	
	@RequestMapping("/modify")
	public String modify(TbClass tbClass,RedirectAttributes attributes) {
		classService.modify(tbClass);
		attributes.addFlashAttribute("message", "编辑成功");
		return "redirect:/class/list";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer classid,RedirectAttributes attributes) {
		
		classService.delete(classid);
		attributes.addFlashAttribute("message", "删除成功");
		return "redirect:/class/list";
	}
	
	

}
