package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.FileModel;
import com.sjzmlb.cms.resume.vo.FileQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface FileDAO extends BaseDAO<FileModel, FileQueryModel>{
	public FileModel getByResumeId(String resumeId);
}
