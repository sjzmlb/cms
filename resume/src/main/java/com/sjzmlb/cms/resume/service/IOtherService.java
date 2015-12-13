package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.OtherModel;
import com.sjzmlb.cms.resume.vo.OtherQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IOtherService extends IBaseService<OtherModel, OtherQueryModel>{
	public OtherModel getByResumeId(String resumeId);
}
