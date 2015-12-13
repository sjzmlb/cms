package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class ProjectExperienceModel extends BaseModel {
	private String resumeId;        
	private String projectId;       
	private String projectName;     
	private String projectStartDate;
	private String projectEndDate;  
	private String itFlag;          
	private String software;        
	private String hardware;        
	private String development;     
	private String responsibilities;
	private String description;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public String getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(String projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getItFlag() {
		return itFlag;
	}
	public void setItFlag(String itFlag) {
		this.itFlag = itFlag;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getHardware() {
		return hardware;
	}
	public void setHardware(String hardware) {
		this.hardware = hardware;
	}
	public String getDevelopment() {
		return development;
	}
	public void setDevelopment(String development) {
		this.development = development;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
