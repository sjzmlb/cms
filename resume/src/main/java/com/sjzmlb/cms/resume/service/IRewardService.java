package com.sjzmlb.cms.resume.service;

import com.sjzmlb.cms.resume.vo.RewardModel;
import com.sjzmlb.cms.resume.vo.RewardQueryModel;
import com.sjzmlb.common.service.IBaseService;

public interface IRewardService extends IBaseService<RewardModel, RewardQueryModel>{
	public RewardModel getByResumeId(String resumeId);
}
