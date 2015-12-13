package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.FileModel;
import com.sjzmlb.cms.resume.vo.FileQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IFileService extends IBaseService<FileModel, FileQueryModel>{
	public FileModel getByResumeId(String resumeId);
}
