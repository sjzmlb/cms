package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.LanguageModel;
import com.sjzmlb.cms.resume.vo.LanguageQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface ILanguageService extends IBaseService<LanguageModel, LanguageQueryModel>{
	public LanguageModel getByResumeId(String resumeId);
}
