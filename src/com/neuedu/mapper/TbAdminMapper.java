package com.neuedu.mapper;

import org.apache.ibatis.annotations.Param;

import com.neuedu.po.TbAdmin;

public interface TbAdminMapper {
    int deleteByPrimaryKey(Integer adminid);

    int insert(TbAdmin record);

    int insertSelective(TbAdmin record);

    TbAdmin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(TbAdmin record);

    int updateByPrimaryKey(TbAdmin record);
    
    TbAdmin getAdminByUsernameAndPassword(@Param("u")String username,@Param("p")String password);
    
}