package com.neuedu.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.core.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.neuedu.commons.Commons;
import com.neuedu.po.TbClass;
import com.neuedu.po.TbStudent;
import com.neuedu.service.ClassService;
import com.neuedu.service.StudentService;
import com.neuedu.utils.UploadUtils;
import com.neuedu.vo.StudentVO;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ClassService classService;
	
	@RequestMapping({"/","/list"})
	public String list(Model model) {
		
		//查询所有的学生信息
		List<StudentVO> list = studentService.getList();
		
		List<TbClass> classes = classService.getList();
		
		model.addAttribute("list", list);
		model.addAttribute("classes", classes);
		
		return "admin/studentManager";
	}
	
	@RequestMapping("/save")
	public String save(TbStudent tbStudent,HttpServletRequest request,@RequestParam("fileurl") MultipartFile multipartFile) throws Exception {
		String picurl = UploadUtils.fileUpload(Commons.basePath, request, multipartFile);
		tbStudent.setPicurl(picurl);
		studentService.save(tbStudent);
		return "redirect:/student/";
	}
	
	@RequestMapping("/modify")
	public String modify(TbStudent tbStudent) {
		studentService.update(tbStudent);
		return "redirect:/student/";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer stuid) {		
		studentService.delete(stuid);
		return "redirect:/student/";
	}
	
	
	
}
