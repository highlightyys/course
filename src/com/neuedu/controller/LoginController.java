package com.neuedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.po.TbAdmin;
import com.neuedu.service.AdminService;
@RequestMapping("/login")
@Controller
public class LoginController {
	
	@Autowired
	private AdminService as;
	
	@RequestMapping({"/","/show"})
	public String showLogin() {
		return "admin/login";
	}
	/**
	 * 处理登录请求
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session,Model model) {
		TbAdmin tbAdmin = as.login(username, password);
		
		if(tbAdmin == null) {//登录失败
			model.addAttribute("username", username);
			model.addAttribute("password", password);
			model.addAttribute("message", "用户名或密码错误");
			
			return "admin/login";			
		}
		//登录成功
		
		session.setAttribute("admin", tbAdmin);
		
		return "admin/index";
	}

}
