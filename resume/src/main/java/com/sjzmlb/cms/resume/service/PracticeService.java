package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjzmlb.cms.resume.dao.PracticeDAO;
import com.sjzmlb.cms.resume.vo.PracticeModel;
import com.sjzmlb.cms.resume.vo.PracticeQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class PracticeService extends BaseService<PracticeModel, PracticeQueryModel> implements IPracticeService{
	private PracticeDAO dao = null;
	@Autowired
	private void setDao(PracticeDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public PracticeModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
