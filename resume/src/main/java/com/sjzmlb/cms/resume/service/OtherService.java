package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.OtherDAO;
import com.sjzmlb.cms.resume.vo.OtherModel;
import com.sjzmlb.cms.resume.vo.OtherQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class OtherService extends BaseService<OtherModel, OtherQueryModel> implements IOtherService{
	private OtherDAO dao = null;
	@Autowired
	private void setDao(OtherDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public OtherModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
