package com.sjzmlb.customermgr.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.common.dao.BaseDAO;
import com.sjzmlb.customermgr.vo.CustomerModel;
import com.sjzmlb.customermgr.vo.CustomerQueryModel;

@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
