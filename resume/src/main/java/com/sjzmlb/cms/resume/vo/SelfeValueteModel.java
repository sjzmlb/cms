package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class SelfeValueteModel extends BaseModel {
	private String resumeId;          
	private String customCommenttitle;
	private String commentcontent;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getCustomCommenttitle() {
		return customCommenttitle;
	}
	public void setCustomCommenttitle(String customCommenttitle) {
		this.customCommenttitle = customCommenttitle;
	}
	public String getCommentcontent() {
		return commentcontent;
	}
	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}
}
