package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.JobIntensionModel;
import com.sjzmlb.cms.resume.vo.JobIntensionQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IJobIntensionService extends IBaseService<JobIntensionModel, JobIntensionQueryModel>{
	public JobIntensionModel getByResumeId(String resumeId);
}
