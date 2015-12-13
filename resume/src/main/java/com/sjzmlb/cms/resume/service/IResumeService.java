package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.ResumeModel;
import com.sjzmlb.cms.resume.vo.ResumeQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IResumeService extends IBaseService<ResumeModel, ResumeQueryModel>{
	public ResumeModel getByResumeId(String resumeId);
}
