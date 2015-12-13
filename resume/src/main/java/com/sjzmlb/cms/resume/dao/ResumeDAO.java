package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.ResumeModel;
import com.sjzmlb.cms.resume.vo.ResumeQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface ResumeDAO extends BaseDAO<ResumeModel, ResumeQueryModel>{
	public ResumeModel getByResumeId(String resumeId);
}
