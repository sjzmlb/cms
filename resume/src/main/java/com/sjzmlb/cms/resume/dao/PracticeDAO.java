package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.PracticeModel;
import com.sjzmlb.cms.resume.vo.PracticeQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface PracticeDAO extends BaseDAO<PracticeModel, PracticeQueryModel>{
	public PracticeModel getByResumeId(String resumeId);
}
