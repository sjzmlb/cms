package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class ProfessionalSkillModel extends BaseModel {
	private String resumeId;          	
	private String professionalSkillId;
	private String professionalSkillName;
	private String actualExperience;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getProfessionalSkillId() {
		return professionalSkillId;
	}
	public void setProfessionalSkillId(String professionalSkillId) {
		this.professionalSkillId = professionalSkillId;
	}
	public String getProfessionalSkillName() {
		return professionalSkillName;
	}
	public void setProfessionalSkillName(String professionalSkillName) {
		this.professionalSkillName = professionalSkillName;
	}
	public String getActualExperience() {
		return actualExperience;
	}
	public void setActualExperience(String actualExperience) {
		this.actualExperience = actualExperience;
	}
	
}
