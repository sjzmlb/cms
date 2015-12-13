package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class LanguageModel extends BaseModel {
	private String resumeId;     
	private String languagesId;  
	private String readability;  
	private String spokenability;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getLanguagesId() {
		return languagesId;
	}
	public void setLanguagesId(String languagesId) {
		this.languagesId = languagesId;
	}
	public String getReadability() {
		return readability;
	}
	public void setReadability(String readability) {
		this.readability = readability;
	}
	public String getSpokenability() {
		return spokenability;
	}
	public void setSpokenability(String spokenability) {
		this.spokenability = spokenability;
	}
}
