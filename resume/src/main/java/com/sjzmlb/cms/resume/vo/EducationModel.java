package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class EducationModel extends BaseModel {
	private String resumeId;   
	private String educationId;
	private String startDate;  
	private String endDate;    
	private String schoolName; 
	private String tongzhao;   
	private String mainmajor;  
	private String submajor;   
	private String degree;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getEducationId() {
		return educationId;
	}
	public void setEducationId(String educationId) {
		this.educationId = educationId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getTongzhao() {
		return tongzhao;
	}
	public void setTongzhao(String tongzhao) {
		this.tongzhao = tongzhao;
	}
	public String getMainmajor() {
		return mainmajor;
	}
	public void setMainmajor(String mainmajor) {
		this.mainmajor = mainmajor;
	}
	public String getSubmajor() {
		return submajor;
	}
	public void setSubmajor(String submajor) {
		this.submajor = submajor;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
