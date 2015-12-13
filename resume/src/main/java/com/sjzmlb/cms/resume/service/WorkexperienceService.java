package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.WorkexperienceDAO;
import com.sjzmlb.cms.resume.vo.WorkexperienceModel;
import com.sjzmlb.cms.resume.vo.WorkexperienceQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class WorkexperienceService extends BaseService<WorkexperienceModel, WorkexperienceQueryModel> implements IWorkexperienceService{
	private WorkexperienceDAO dao = null;
	@Autowired
	private void setDao(WorkexperienceDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public WorkexperienceModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
