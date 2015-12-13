package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.LanguageModel;
import com.sjzmlb.cms.resume.vo.LanguageQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface LanguageDAO extends BaseDAO<LanguageModel, LanguageQueryModel>{
	public LanguageModel getByResumeId(String resumeId);
}
