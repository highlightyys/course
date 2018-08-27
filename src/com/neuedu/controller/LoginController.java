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
	 * �����¼����
	 * @param username �û���
	 * @param password ����
	 * @return
	 */
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session,Model model) {
		TbAdmin tbAdmin = as.login(username, password);
		
		if(tbAdmin == null) {//��¼ʧ��
			model.addAttribute("username", username);
			model.addAttribute("password", password);
			model.addAttribute("message", "�û������������");
			
			return "admin/login";			
		}
		//��¼�ɹ�
		
		session.setAttribute("admin", tbAdmin);
		
		return "admin/index";
	}

}
