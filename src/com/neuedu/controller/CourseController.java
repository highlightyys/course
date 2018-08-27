package com.neuedu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.commons.Commons;
import com.neuedu.po.TbCourse;
import com.neuedu.service.CourseService;
import com.neuedu.vo.PageBean;
import com.sun.javafx.css.CssError.InlineStyleParsingError;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping({"/","/list"})
	public String list(@RequestParam(value="nowPage",required=false,defaultValue="1")
									Integer nowPage,Model model) {
		//��ѯ�γ��б�
		
		PageBean<TbCourse> pageBean = new PageBean<>(nowPage,Commons.RECORD);
		
		courseService.getList(pageBean);
		
		model.addAttribute("pageBean", pageBean);
	
		return "admin/courseManager";
	}
	
	///��ʾ���ҳ��
	@RequestMapping("/showAdd")
	public String showAdd() {
		return "admin/courseAdd";
	}
	
	@RequestMapping("/checkByName")
	@ResponseBody
	public String checkByName(String coursename) {
		TbCourse courseByName = courseService.getCourseByName(coursename);
		if(courseByName != null) {
			
			return "�ÿγ��Ѵ���";
		}
		return "";
	}
	
	
	//����γ���Ϣ
	@RequestMapping("/save")
	public String save(TbCourse tbCourse) {
		
		//����service����γ���Ϣ
		courseService.save(tbCourse);
		return "redirect:/course/";
	}
	
	//��ʾ�޸�ҳ��
	@RequestMapping("/showModify")
	public String showModify(Integer courseid,Map<String,Object> map) {
		TbCourse tbCourse = courseService.getCourseById(courseid);
		map.put("c", tbCourse);
		
		return "admin/courseModify";
	}
	
	
	@RequestMapping("/modify")
	public String modify(TbCourse tbCourse) {
		courseService.update(tbCourse);
		return "redirect:/course/";
		
	}
	
	@RequestMapping("/delete")
	public String delete(Integer courseid) {
		courseService.delete(courseid);
		return "redirect:/course/";
	}

}
