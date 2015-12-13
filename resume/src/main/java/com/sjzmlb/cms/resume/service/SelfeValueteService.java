package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.SelfeValueteDAO;
import com.sjzmlb.cms.resume.vo.SelfeValueteModel;
import com.sjzmlb.cms.resume.vo.SelfeValueteQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class SelfeValueteService extends BaseService<SelfeValueteModel, SelfeValueteQueryModel> implements ISelfeValueteService{
	private SelfeValueteDAO dao = null;
	@Autowired
	private void setDao(SelfeValueteDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public SelfeValueteModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
