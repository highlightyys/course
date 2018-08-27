package com.neuedu.service;

import java.util.List;

import com.neuedu.po.Selection;
import com.neuedu.vo.ScoreInVO;

public interface ScoreInService {
	public List<ScoreInVO> getList();
	
	public void batModify(List<Selection> selections);
	
	public void modify(Selection selection);
	
	public void deleteScore(Integer selid);
	
}
