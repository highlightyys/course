package com.neuedu.po;

public class Selection {
    private Integer selid;

    private Integer stuid;

    private Integer courseid;

    private Integer year;

    private String term;

    private Double grade;

    public Integer getSelid() {
        return selid;
    }

    public void setSelid(Integer selid) {
        this.selid = selid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

	@Override
	public String toString() {
		return "Selection [selid=" + selid + ", stuid=" + stuid + ", courseid=" + courseid + ", year=" + year
				+ ", term=" + term + ", grade=" + grade + "]";
	}
    
    
}