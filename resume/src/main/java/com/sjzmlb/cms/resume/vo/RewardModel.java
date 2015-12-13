package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class RewardModel extends BaseModel {
	private String resumeId;         
	private String rewardId;         
	private String rewardName;       
	private String rewardLevel;      
	private String rewardDate;       
	private String descriptionReward;
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getRewardId() {
		return rewardId;
	}
	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}
	public String getRewardName() {
		return rewardName;
	}
	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}
	public String getRewardLevel() {
		return rewardLevel;
	}
	public void setRewardLevel(String rewardLevel) {
		this.rewardLevel = rewardLevel;
	}
	public String getRewardDate() {
		return rewardDate;
	}
	public void setRewardDate(String rewardDate) {
		this.rewardDate = rewardDate;
	}
	public String getDescriptionReward() {
		return descriptionReward;
	}
	public void setDescriptionReward(String descriptionReward) {
		this.descriptionReward = descriptionReward;
	}
}
