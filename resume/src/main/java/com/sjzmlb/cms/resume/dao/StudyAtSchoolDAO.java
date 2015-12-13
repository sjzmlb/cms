package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.StudyAtSchoolModel;
import com.sjzmlb.cms.resume.vo.StudyAtSchoolQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface StudyAtSchoolDAO extends BaseDAO<StudyAtSchoolModel, StudyAtSchoolQueryModel>{
	public StudyAtSchoolModel getByResumeId(String resumeId);
}
