package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.OtherModel;
import com.sjzmlb.cms.resume.vo.OtherQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface OtherDAO extends BaseDAO<OtherModel, OtherQueryModel>{
	public OtherModel getByResumeId(String resumeId);
}
