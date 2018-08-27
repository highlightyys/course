package com.neuedu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckInterceptor implements HandlerInterceptor {
	
	/**
	 * �÷�����Ŀ�귽��ִ��֮ǰִ�У�
	 * ������ֵΪ true,�����ִ�к�������������Ŀ�귽��
	 * ������ֵΪfalse,�򲻻��ٵ��ú������������Ŀ�귽��
	 * ������Ȩ��У�飬��־
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		//System.out.println("CheckInterceptor preHandle......");
		
		HttpSession session = request.getSession();
		Object admin = session.getAttribute("admin");
		if(admin != null) {
			return true;
		}
		
		request.getRequestDispatcher("/WEB-INF/views/admin/login.jsp").forward(request, response);
		return false;
	}
	
	/**
	 * �÷������ڵ���Ŀ�귽��֮����Ⱦ��ͼ֮ǰִ��
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		

	}
	
	/*
	 *�÷������ڵ�����Ŀ�귽��֮����Ⱦ����ͼ��ִ��
	 *��Ҫ����һЩ�ͷ���Դ����¼��־
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		

	}

	
}
