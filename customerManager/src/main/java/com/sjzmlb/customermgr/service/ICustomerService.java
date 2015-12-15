package com.sjzmlb.customermgr.service;

import com.sjzmlb.common.service.IBaseService;
import com.sjzmlb.customermgr.vo.CustomerModel;
import com.sjzmlb.customermgr.vo.CustomerQueryModel;

public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
