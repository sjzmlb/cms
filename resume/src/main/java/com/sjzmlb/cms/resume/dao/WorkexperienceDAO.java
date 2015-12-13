package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.WorkexperienceModel;
import com.sjzmlb.cms.resume.vo.WorkexperienceQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface WorkexperienceDAO extends BaseDAO<WorkexperienceModel, WorkexperienceQueryModel>{
	public WorkexperienceModel getByResumeId(String resumeId);
}
