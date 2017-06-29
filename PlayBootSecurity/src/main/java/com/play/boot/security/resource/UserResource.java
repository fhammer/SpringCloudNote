package com.play.boot.security.resource;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.play.boot.security.bean.JSONResult;

@RestController
@RequestMapping("/users")
public class UserResource {
	// 路由映射到/users
	@RequestMapping(value = "/timeline", produces = "application/json;charset=UTF-8")
	public String usersList() {

		ArrayList<String> users = new ArrayList<String>();
		users.add("freewolf");
		users.add("tom");
		users.add("jerry");

		return JSONResult.fillResultString(0, "", users);
	}

	@RequestMapping(value = "/hello", produces = "application/json;charset=UTF-8")
	public String hello() {
		ArrayList<String> users = new ArrayList<String>() ;
		users.add("hello");
		return JSONResult.fillResultString(0, "", users);
	}

	@RequestMapping(value = "/world", produces = "application/json;charset=UTF-8")
	public String world() {
		ArrayList<String> users = new ArrayList<String>() ;
		users.add("world");
		return JSONResult.fillResultString(0, "", users);
	}
}
