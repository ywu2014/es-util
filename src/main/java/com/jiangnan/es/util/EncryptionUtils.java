/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @description 加密工具类
 * @author ywu@wuxicloud.com
 * 2015年5月12日 下午1:11:33
 */
public final class EncryptionUtils {
	
	
	private EncryptionUtils() {
		
	}
	
	/**
	 * md5摘要
	 * @param source
	 * @return
	 */
	public static String md5(String source) {
		return DigestUtils.md5Hex(source);
	}
	
	public static void main(String[] args) {
		String userName = "zhangsan";
		String password = "123";
		String salt = "qwe";
		String source = userName + password + salt;
		System.out.println(md5(source));
	}
}
