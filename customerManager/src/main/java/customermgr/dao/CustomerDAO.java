package customermgr.dao;

import org.springframework.stereotype.Repository;

import com.sjzmlb.common.dao.BaseDAO;

import customermgr.vo.CustomerModel;
import customermgr.vo.CustomerQueryModel;

@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
