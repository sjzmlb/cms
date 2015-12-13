package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class FileModel extends BaseModel {
	private String resumeId;   
	private String fileId;     
	private String filename;   
	private String description;
	private String fileDir;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFileDir() {
		return fileDir;
	}
	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}
}
