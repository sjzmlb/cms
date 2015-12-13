package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.ProfessionalSkillModel;
import com.sjzmlb.cms.resume.vo.ProfessionalSkillQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IProfessionalSkillService extends IBaseService<ProfessionalSkillModel, ProfessionalSkillQueryModel>{
	public ProfessionalSkillModel getByResumeId(String resumeId);
}
