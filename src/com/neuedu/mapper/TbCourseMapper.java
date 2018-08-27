package com.neuedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.po.TbCourse;

public interface TbCourseMapper {
    int deleteByPrimaryKey(Integer courseid);

    int insert(TbCourse record);

    int insertSelective(TbCourse record);

    TbCourse selectByPrimaryKey(Integer courseid);

    int updateByPrimaryKeySelective(TbCourse record);

    int updateByPrimaryKey(TbCourse record);
    
    public List<TbCourse> getList(@Param("start") int start,@Param("record")int record);
    
    public int getCount();
    
    public TbCourse getCourseByName(@Param("coursename") String coursename);
    
    
    
}