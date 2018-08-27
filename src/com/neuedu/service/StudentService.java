package com.neuedu.service;

import java.util.List;

import com.neuedu.po.TbStudent;
import com.neuedu.vo.StudentVO;

public interface StudentService {
	public List<StudentVO> getList();
	public void save(TbStudent tbStudent);
	
	public void update(TbStudent tbStudent);
	
	public void delete(Integer stuid);
}
