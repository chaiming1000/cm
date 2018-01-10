package com.eduask.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	//返回值必须是LinkedHashMap
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("/login.jsp", "anon");
		map.put("/shiro/login", "anon");
		map.put("/shiro/logout", "logout");
		map.put("/admin.jsp", "roles[admin]");
		map.put("/user.jsp", "roles[user]");				
		map.put("/**", "authc");
		return map;
	}
}
