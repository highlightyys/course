package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ScoreInMapper;
import com.neuedu.mapper.SelectionMapper;
import com.neuedu.po.Selection;
import com.neuedu.service.ScoreInService;
import com.neuedu.vo.ScoreInVO;

@Service
public class ScoreInServiceImpl implements ScoreInService {
	
	@Autowired
	private ScoreInMapper scoreMapper;
	@Autowired
	private SelectionMapper selMapper;

	@Override
	public List<ScoreInVO> getList() {		
		return scoreMapper.getList();
	}

	@Override
	public void batModify(List<Selection> selections) {
		for (Selection s : selections) {
			selMapper.updateByPrimaryKeySelective(s);
		}		
	}

	@Override
	public void modify(Selection selection) {
		selMapper.updateByPrimaryKeySelective(selection);		
	}

	@Override
	public void deleteScore(Integer selid) {
		scoreMapper.deleteScore(selid);
	}
	
	

}
