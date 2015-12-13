package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.JobIntensionDAO;
import com.sjzmlb.cms.resume.vo.JobIntensionModel;
import com.sjzmlb.cms.resume.vo.JobIntensionQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class JobIntensionService extends BaseService<JobIntensionModel, JobIntensionQueryModel> implements IJobIntensionService{
	private JobIntensionDAO dao = null;
	@Autowired
	private void setDao(JobIntensionDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public JobIntensionModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
