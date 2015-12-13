package com.sjzmlb.memcached;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;
//@Service
public class ClientTest {
//	@Autowired
//	private MemCachedClient mcc;
	
//	public void setMcc(MemCachedClient mcc){
//		this.mcc = mcc;
//	}
	
	public static void main(String[] args) {
//		MemCachedClient mcc = CacheHelper.getMemCachedClient();
//		
//		mcc.add("k2", "12345");
//		
//		Object obj = mcc.get("k2");
		
//		UserModel um = new UserModel("11","11Name",11);
//		mcc.set("t1", um);
//		
//		Object obj = mcc.get("t1");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClientTest ct = (ClientTest)ctx.getBean("clientTest");
		
		
//		List<UserModel> list = new ArrayList<UserModel>();
//		UserModel um1 = new UserModel("33","11Name",11);
//		UserModel um2 = new UserModel("44","22Name",22);
//		
//		list.add(um1);
//		list.add(um2);
//		
//		ct.mcc.set("t1", list);
		
//		ct.mcc.set("k1","springt1");
//		
//		Object obj = ct.mcc.get("k1");
//		
//		System.out.println("obj==="+obj);		
		
	}
}
