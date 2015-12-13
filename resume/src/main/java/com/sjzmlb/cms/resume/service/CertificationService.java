package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.CertificationDAO;
import com.sjzmlb.cms.resume.vo.CertificationModel;
import com.sjzmlb.cms.resume.vo.CertificationQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class CertificationService extends BaseService<CertificationModel, CertificationQueryModel> implements ICertificationService{
	private CertificationDAO dao = null;
	@Autowired
	private void setDao(CertificationDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public CertificationModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
