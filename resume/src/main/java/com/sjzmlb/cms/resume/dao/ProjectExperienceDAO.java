package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.ProjectExperienceModel;
import com.sjzmlb.cms.resume.vo.ProjectExperienceQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface ProjectExperienceDAO extends BaseDAO<ProjectExperienceModel, ProjectExperienceQueryModel>{
	public ProjectExperienceModel getByResumeId(String resumeId);
}
