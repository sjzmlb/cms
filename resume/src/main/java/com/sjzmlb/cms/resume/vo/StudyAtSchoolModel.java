package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class StudyAtSchoolModel extends BaseModel {
	private String resumeId;   
	private String burse;      
	private String description;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getBurse() {
		return burse;
	}
	public void setBurse(String burse) {
		this.burse = burse;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
