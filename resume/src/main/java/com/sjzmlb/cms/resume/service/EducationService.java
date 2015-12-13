package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.EducationDAO;
import com.sjzmlb.cms.resume.vo.EducationModel;
import com.sjzmlb.cms.resume.vo.EducationQueryModel;
import com.sjzmlb.cms.resume.vo.ResumeModel;
import com.sjzmlb.cms.resume.vo.ResumeQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class EducationService extends BaseService<EducationModel, EducationQueryModel> implements IEducationService{
	private EducationDAO dao = null;
	@Autowired
	private void setDao(EducationDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public EducationModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
