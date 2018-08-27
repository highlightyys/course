package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.TbClassMapper;
import com.neuedu.po.TbClass;
import com.neuedu.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	private TbClassMapper tbClassMapper;

	@Override
	public void save(TbClass tbClass) {
		tbClassMapper.insertSelective(tbClass);		
	}

	@Override
	public List<TbClass> getList() {
		return tbClassMapper.getList();
	}

	@Override
	public void modify(TbClass tbClass) {
		tbClassMapper.updateByPrimaryKeySelective(tbClass);		
	}

	@Override
	public void delete(Integer classid) {
		tbClassMapper.deleteByPrimaryKey(classid);
		
	}
	


}
