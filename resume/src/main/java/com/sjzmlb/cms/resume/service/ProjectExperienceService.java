package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.ProjectExperienceDAO;
import com.sjzmlb.cms.resume.vo.ProjectExperienceModel;
import com.sjzmlb.cms.resume.vo.ProjectExperienceQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class ProjectExperienceService extends BaseService<ProjectExperienceModel, ProjectExperienceQueryModel> implements IProjectExperienceService{
	private ProjectExperienceDAO dao = null;
	@Autowired
	private void setDao(ProjectExperienceDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public ProjectExperienceModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
