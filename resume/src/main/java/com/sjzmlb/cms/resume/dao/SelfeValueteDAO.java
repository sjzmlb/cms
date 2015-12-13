package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.SelfeValueteModel;
import com.sjzmlb.cms.resume.vo.SelfeValueteQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface SelfeValueteDAO extends BaseDAO<SelfeValueteModel, SelfeValueteQueryModel>{
	public SelfeValueteModel getByResumeId(String resumeId);
}
