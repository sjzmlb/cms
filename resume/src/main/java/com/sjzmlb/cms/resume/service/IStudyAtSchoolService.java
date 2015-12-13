package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.StudyAtSchoolModel;
import com.sjzmlb.cms.resume.vo.StudyAtSchoolQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IStudyAtSchoolService extends IBaseService<StudyAtSchoolModel, StudyAtSchoolQueryModel>{
	public StudyAtSchoolModel getByResumeId(String resumeId);
}
