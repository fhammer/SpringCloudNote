package com.play.boot.security.resource;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	// 根目录映射 Get访问方式 直接返回一个字符串
	@RequestMapping("/")
	Map<String, String> hello() {
		// 返回map会变成JSON key value方式
		Map<String, String> map = new HashMap<String, String>();
		map.put("content", "hello fuzhenhui!");
		return map;
	}
}
