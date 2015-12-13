package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.WorkexperienceModel;
import com.sjzmlb.cms.resume.vo.WorkexperienceQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IWorkexperienceService extends IBaseService<WorkexperienceModel, WorkexperienceQueryModel>{
	public WorkexperienceModel getByResumeId(String resumeId);
}
