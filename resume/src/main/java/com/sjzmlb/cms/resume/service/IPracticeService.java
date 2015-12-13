package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.PracticeModel;
import com.sjzmlb.cms.resume.vo.PracticeQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IPracticeService extends IBaseService<PracticeModel, PracticeQueryModel>{
	public PracticeModel getByResumeId(String resumeId);
}
