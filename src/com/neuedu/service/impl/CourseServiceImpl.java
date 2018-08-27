package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.commons.Commons;
import com.neuedu.mapper.TbCourseMapper;
import com.neuedu.po.TbCourse;
import com.neuedu.service.CourseService;
import com.neuedu.vo.PageBean;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private TbCourseMapper courseMapper;

	@Override
	public void save(TbCourse tbCourse) {
		courseMapper.insertSelective(tbCourse);
	}

	@Override
	public void getList(PageBean<TbCourse> pageBean) {
		
		//通过计算计算出从第几条开始查询
		int start = (pageBean.getNowPage() - 1) * pageBean.getRecord();
		List<TbCourse> list = courseMapper.getList(start,pageBean.getRecord());
		pageBean.setList(list);
		
		int count = courseMapper.getCount(); //总记录数
		pageBean.setCount(count);
		
	}

	@Override
	public TbCourse getCourseById(Integer courseid) {
		
		return courseMapper.selectByPrimaryKey(courseid);
	}

	@Override
	public void update(TbCourse tbCourse) {
		courseMapper.updateByPrimaryKeySelective(tbCourse);		
	}

	@Override
	public void delete(Integer courseid) {
		courseMapper.deleteByPrimaryKey(courseid);		
	}

	@Override
	public int getCount() {		
		return courseMapper.getCount();
	}

	@Override
	public TbCourse getCourseByName(String coursename) {		
		return courseMapper.getCourseByName(coursename);
	}

}
