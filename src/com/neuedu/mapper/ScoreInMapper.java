package com.neuedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.vo.ScoreInVO;

public interface ScoreInMapper {
	
	public List<ScoreInVO> getList();
	public void deleteScore(@Param("selid")Integer selid);

}
