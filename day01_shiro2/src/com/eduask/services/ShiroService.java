package com.eduask.services;

import java.util.Date;

import org.apache.shiro.authz.annotation.RequiresRoles;

public class ShiroService {
	//此时用user登录，访问此方法会报错，可以通过spring的注解异常处理，返回到异常页面
	@RequiresRoles("admin")
	public void testMethod(){
		System.out.println("我是shiro的service层:"+new Date());
	}
}
