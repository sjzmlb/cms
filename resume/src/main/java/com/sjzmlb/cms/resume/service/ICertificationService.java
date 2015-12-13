package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.CertificationModel;
import com.sjzmlb.cms.resume.vo.CertificationQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface ICertificationService extends IBaseService<CertificationModel, CertificationQueryModel>{
	public CertificationModel getByResumeId(String resumeId);
}
