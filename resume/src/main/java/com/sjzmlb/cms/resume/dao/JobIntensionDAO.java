package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.JobIntensionModel;
import com.sjzmlb.cms.resume.vo.JobIntensionQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface JobIntensionDAO extends BaseDAO<JobIntensionModel, JobIntensionQueryModel>{
	public JobIntensionModel getByResumeId(String resumeId);
}
