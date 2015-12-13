package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.ProjectExperienceModel;
import com.sjzmlb.cms.resume.vo.ProjectExperienceQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IProjectExperienceService extends IBaseService<ProjectExperienceModel, ProjectExperienceQueryModel>{
	public ProjectExperienceModel getByResumeId(String resumeId);
}
