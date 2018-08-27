package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.TbStudentMapper;
import com.neuedu.po.TbStudent;
import com.neuedu.service.StudentService;
import com.neuedu.vo.StudentVO;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	TbStudentMapper studentMapper;

	@Override
	public List<StudentVO> getList() {
		
		return studentMapper.getList();
	}

	@Override
	public void save(TbStudent tbStudent) {
		studentMapper.insertSelective(tbStudent);		
	}

	@Override
	public void update(TbStudent tbStudent) {
		studentMapper.updateByPrimaryKeySelective(tbStudent);		
	}

	@Override
	public void delete(Integer stuid) {
		studentMapper.deleteByPrimaryKey(stuid);		
	}
	
}
