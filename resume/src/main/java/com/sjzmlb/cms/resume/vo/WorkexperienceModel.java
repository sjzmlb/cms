package com.sjzmlb.cms.resume.vo;

import com.sjzmlb.common.vo.BaseModel;

public class WorkexperienceModel extends BaseModel {
	private String resumeId;        
	private String expnum;          
	private String cmpanyName;      
	private String industry;        
	private String jobtype;         
	private String jobname;         
	private String workstartDate;   
	private String workendDate;     
	private String salaryScope;     
	private String sellResumecont;  
	private String companyType;     
	private String companySize;
	
	public String getResumeId() {
		return resumeId;
	}
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	public String getExpnum() {
		return expnum;
	}
	public void setExpnum(String expnum) {
		this.expnum = expnum;
	}
	public String getCmpanyName() {
		return cmpanyName;
	}
	public void setCmpanyName(String cmpanyName) {
		this.cmpanyName = cmpanyName;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getWorkstartDate() {
		return workstartDate;
	}
	public void setWorkstartDate(String workstartDate) {
		this.workstartDate = workstartDate;
	}
	public String getWorkendDate() {
		return workendDate;
	}
	public void setWorkendDate(String workendDate) {
		this.workendDate = workendDate;
	}
	public String getSalaryScope() {
		return salaryScope;
	}
	public void setSalaryScope(String salaryScope) {
		this.salaryScope = salaryScope;
	}
	public String getSellResumecont() {
		return sellResumecont;
	}
	public void setSellResumecont(String sellResumecont) {
		this.sellResumecont = sellResumecont;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanySize() {
		return companySize;
	}
	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}
}
