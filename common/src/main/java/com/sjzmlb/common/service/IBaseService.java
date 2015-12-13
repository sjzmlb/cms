package com.sjzmlb.common.service;

import com.sjzmlb.common.vo.BaseModel;
import com.sjzmlb.pageutil.Page;

public interface IBaseService<M,QM extends BaseModel> {
	public void create(M m);
	public void update(M m);
	public void delete(int uuid);
	
	public M getByUuid(int uuid);
	public Page<M> getByConditionPage(QM qm);
}
