package com.neuedu.vo;

import java.util.List;

import com.neuedu.po.Selection;

public class ScoreInVO extends Selection{
	private String classname;
	private String stunum;
	private String stuname;
	private String coursename;
	private double score;
	
	List<Selection> selections;
	
	
	public List<Selection> getSelections() {
		return selections;
	}
	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getStunum() {
		return stunum;
	}
	public void setStunum(String stunum) {
		this.stunum = stunum;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
