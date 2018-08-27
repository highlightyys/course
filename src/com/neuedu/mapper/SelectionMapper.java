package com.neuedu.mapper;

import com.neuedu.po.Selection;

public interface SelectionMapper {
    int deleteByPrimaryKey(Integer selid);

    int insert(Selection record);

    int insertSelective(Selection record);

    Selection selectByPrimaryKey(Integer selid);

    int updateByPrimaryKeySelective(Selection record);

    int updateByPrimaryKey(Selection record);
}