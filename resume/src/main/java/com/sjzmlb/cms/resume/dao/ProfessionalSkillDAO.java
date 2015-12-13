package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.ProfessionalSkillModel;
import com.sjzmlb.cms.resume.vo.ProfessionalSkillQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface ProfessionalSkillDAO extends BaseDAO<ProfessionalSkillModel, ProfessionalSkillQueryModel>{
	public ProfessionalSkillModel getByResumeId(String resumeId);
}
