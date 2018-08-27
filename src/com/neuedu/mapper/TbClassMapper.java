package com.neuedu.mapper;

import java.util.List;

import com.neuedu.po.TbClass;

public interface TbClassMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(TbClass record);

    int insertSelective(TbClass record);

    TbClass selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(TbClass record);

    int updateByPrimaryKey(TbClass record);
    
    public List<TbClass> getList();
}