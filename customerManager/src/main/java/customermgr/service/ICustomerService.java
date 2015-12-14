package customermgr.service;

import com.sjzmlb.common.service.IBaseService;

import customermgr.vo.CustomerModel;
import customermgr.vo.CustomerQueryModel;

public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
