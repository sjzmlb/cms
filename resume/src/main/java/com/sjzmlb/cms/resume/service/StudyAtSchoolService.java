package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.StudyAtSchoolDAO;
import com.sjzmlb.cms.resume.vo.StudyAtSchoolModel;
import com.sjzmlb.cms.resume.vo.StudyAtSchoolQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class StudyAtSchoolService extends BaseService<StudyAtSchoolModel, StudyAtSchoolQueryModel> implements IStudyAtSchoolService{
	private StudyAtSchoolDAO dao = null;
	@Autowired
	private void setDao(StudyAtSchoolDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public StudyAtSchoolModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
