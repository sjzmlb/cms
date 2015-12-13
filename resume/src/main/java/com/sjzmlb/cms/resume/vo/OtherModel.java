package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class OtherModel extends BaseModel {
	private String resumeId;   
	private String otherId;     
	private String title;       
	private String description;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getOtherId() {
		return otherId;
	}
	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
