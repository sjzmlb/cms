package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.SelfeValueteModel;
import com.sjzmlb.cms.resume.vo.SelfeValueteQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface ISelfeValueteService extends IBaseService<SelfeValueteModel, SelfeValueteQueryModel>{
	public SelfeValueteModel getByResumeId(String resumeId);
}
