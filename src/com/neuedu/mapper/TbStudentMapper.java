package com.neuedu.mapper;

import java.util.List;

import com.neuedu.po.TbStudent;
import com.neuedu.vo.ScoreInVO;
import com.neuedu.vo.StudentVO;

public interface TbStudentMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    TbStudent selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);
    
    List<StudentVO> getList();
    
    
}