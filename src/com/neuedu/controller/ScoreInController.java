package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.po.Selection;
import com.neuedu.service.ScoreInService;
import com.neuedu.vo.ScoreInVO;

@Controller
@RequestMapping("/scorein")
public class ScoreInController {
	
	@Autowired
	private ScoreInService scoreInService;
	
	@RequestMapping({"/","/list"})
	public String list(Model model) {
	
		List<ScoreInVO> list = scoreInService.getList();
		model.addAttribute("list", list);
		
		return "admin/scoreInManager";
	}
	
	@RequestMapping("/batModify")
	public String batModify(ScoreInVO scoreInVO) {
		scoreInService.batModify(scoreInVO.getSelections());
		return "redirect:/scorein/";
		
	}
	
	@RequestMapping("/modify")
	public String modify(Selection selection) {
		scoreInService.modify(selection);
		return "redirect:/scorein/";
	}
	
	@RequestMapping("/deleteScore")
	public String deleteScore(Integer selid) {
		scoreInService.deleteScore(selid);
		return "redirect:/scorein/";
	}
	
	
	
}
