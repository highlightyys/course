package com.neuedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.TbAdminMapper;
import com.neuedu.po.TbAdmin;
import com.neuedu.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private TbAdminMapper tbAdminMapper;

	@Override
	public TbAdmin login(String username, String password) {
		return tbAdminMapper.getAdminByUsernameAndPassword(username, password);
	}

}
