package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.EducationModel;
import com.sjzmlb.cms.resume.vo.EducationQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface EducationDAO extends BaseDAO<EducationModel, EducationQueryModel>{
	public EducationModel getByResumeId(String resumeId);
}
