package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.ProfessionalSkillDAO;
import com.sjzmlb.cms.resume.vo.ProfessionalSkillModel;
import com.sjzmlb.cms.resume.vo.ProfessionalSkillQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class ProfessionalSkillService extends BaseService<ProfessionalSkillModel, ProfessionalSkillQueryModel> implements IProfessionalSkillService{
	private ProfessionalSkillDAO dao = null;
	@Autowired
	private void setDao(ProfessionalSkillDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public ProfessionalSkillModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
