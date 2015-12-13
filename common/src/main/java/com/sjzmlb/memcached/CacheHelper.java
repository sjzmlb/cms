package com.sjzmlb.memcached;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

public class CacheHelper {
	private static MemCachedClient mcc = new MemCachedClient();

	private CacheHelper() {
	}

	static {
		String[] servers = { "192.168.1.106:2222","192.168.1.106:2223" };
		Integer[] weights = { 1,1 };
		
		SockIOPool pool = SockIOPool.getInstance();
		
		pool.setServers(servers);
		pool.setWeights(weights);
		pool.setInitConn(5);
		pool.setMinConn(5);
		pool.setMaxConn(250);
		pool.setMaxIdle(1000 * 60 * 60 * 6);
		pool.setMaintSleep(30);
		pool.setNagle(false);// 禁用nagle算法
		pool.setSocketConnectTO(0);
		pool.setSocketTO(3000);// 3秒超时
		pool.setHashingAlg(3);// 设置为一致性hash算法
		
		pool.initialize();
	}

	public static MemCachedClient getMemCachedClient() {
		return mcc;
	}

}
