package com.sjzmlb.cms.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sjzmlb.cms.resume.dao.ResumeDAO;
import com.sjzmlb.cms.resume.vo.ResumeModel;
import com.sjzmlb.cms.resume.vo.ResumeQueryModel;
import com.sjzmlb.common.service.BaseService;

@Service
@Transactional
public class ResumeService extends BaseService<ResumeModel, ResumeQueryModel> implements IResumeService{
	private ResumeDAO dao = null;
	@Autowired
	private void setDao(ResumeDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public ResumeModel getByResumeId(String resumeId) {
		return dao.getByResumeId(resumeId);
	}
	
}
