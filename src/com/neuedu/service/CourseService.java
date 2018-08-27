package com.neuedu.service;

import java.util.List;

import com.neuedu.po.TbCourse;
import com.neuedu.vo.PageBean;

public interface CourseService {
	void save(TbCourse tbCourse);
	
	TbCourse getCourseById(Integer courseid);
	
	void getList(PageBean<TbCourse> pageBean);
	
	void update(TbCourse tbCourse);
	
	void delete(Integer courseid);
	
	int getCount();
	
	TbCourse getCourseByName(String coursename);

}
