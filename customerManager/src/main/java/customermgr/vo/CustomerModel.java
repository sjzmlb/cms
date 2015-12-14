package customermgr.vo;

import com.sjzmlb.common.vo.BaseModel;

public class CustomerModel extends BaseModel{
	
	private String customerId;
	private String pwd;
	private String showName;
	private String trueName;
	private String registerTime;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	
	@Override
	public String toString() {
		return "CustomerModel [uuid=" + getUuid() + ", customerId=" + customerId
				+ ", pwd=" + pwd + ", showName=" + showName + ", trueName="
				+ trueName + ", registerTime=" + registerTime + "]";
	}
	
}
