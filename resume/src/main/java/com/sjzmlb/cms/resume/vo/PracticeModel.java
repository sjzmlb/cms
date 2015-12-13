package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class PracticeModel extends BaseModel {
	private String resumeId;         
	private String practiceId;       
	private String practiceName;     
	private String practiceStartDate;
	private String practiceEndDate;  
	private String descriptionPractice;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getPracticeId() {
		return practiceId;
	}
	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}
	public String getPracticeName() {
		return practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}
	public String getPracticeStartDate() {
		return practiceStartDate;
	}
	public void setPracticeStartDate(String practiceStartDate) {
		this.practiceStartDate = practiceStartDate;
	}
	public String getPracticeEndDate() {
		return practiceEndDate;
	}
	public void setPracticeEndDate(String practiceEndDate) {
		this.practiceEndDate = practiceEndDate;
	}
	public String getDescriptionPractice() {
		return descriptionPractice;
	}
	public void setDescriptionPractice(String descriptionPractice) {
		this.descriptionPractice = descriptionPractice;
	}
}
