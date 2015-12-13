package com.sjzmlb.cms.resume.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.cms.resume.vo.RewardModel;
import com.sjzmlb.cms.resume.vo.RewardQueryModel;
import com.sjzmlb.common.dao.BaseDAO;

@Repository
public interface RewardDAO extends BaseDAO<RewardModel, RewardQueryModel>{
	public RewardModel getByResumeId(String resumeId);
}
