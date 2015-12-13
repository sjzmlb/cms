package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.EducationModel;
import com.sjzmlb.cms.resume.vo.EducationQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IEducationService extends IBaseService<EducationModel, EducationQueryModel>{
	public EducationModel getByResumeId(String resumeId);
}
