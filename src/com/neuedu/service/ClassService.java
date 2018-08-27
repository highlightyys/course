package com.neuedu.service;

import java.util.List;

import com.neuedu.po.TbClass;

public interface ClassService {
	public void save(TbClass tbClass);
	public List<TbClass> getList();
	
	public void modify(TbClass tbClass);
	
	public void delete(Integer classid);

}
