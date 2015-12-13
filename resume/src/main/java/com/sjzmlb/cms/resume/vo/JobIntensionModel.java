package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class JobIntensionModel extends BaseModel {
	private String resumeId;           
	private String employmenttype;     
	private String desiredcity;        
	private String desiredjobtype;     
	private String desiredindustry;    
	private String desiredsalaryscope; 
	private String currentcareerstatus;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getEmploymenttype() {
		return employmenttype;
	}
	public void setEmploymenttype(String employmenttype) {
		this.employmenttype = employmenttype;
	}
	public String getDesiredcity() {
		return desiredcity;
	}
	public void setDesiredcity(String desiredcity) {
		this.desiredcity = desiredcity;
	}
	public String getDesiredjobtype() {
		return desiredjobtype;
	}
	public void setDesiredjobtype(String desiredjobtype) {
		this.desiredjobtype = desiredjobtype;
	}
	public String getDesiredindustry() {
		return desiredindustry;
	}
	public void setDesiredindustry(String desiredindustry) {
		this.desiredindustry = desiredindustry;
	}
	public String getDesiredsalaryscope() {
		return desiredsalaryscope;
	}
	public void setDesiredsalaryscope(String desiredsalaryscope) {
		this.desiredsalaryscope = desiredsalaryscope;
	}
	public String getCurrentcareerstatus() {
		return currentcareerstatus;
	}
	public void setCurrentcareerstatus(String currentcareerstatus) {
		this.currentcareerstatus = currentcareerstatus;
	}
}
