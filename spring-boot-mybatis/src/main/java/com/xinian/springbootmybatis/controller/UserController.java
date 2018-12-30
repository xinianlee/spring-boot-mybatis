package com.xinian.springbootmybatis.controller;

import com.xinian.springbootmybatis.entity.User;
import com.xinian.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xinian
 * @date 2018/12/31 1:43
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id){
		return userService.getUserById(id);
	}

	@PutMapping("/user/user")
	public int updateUser(User user){
		return userService.updateUser(user);
	}

	@PostMapping("/user/user")
	public int insertUser(User user){
		return userService.insertUser(user);
	}

	@DeleteMapping("/user/{id}")
	public int delUser(@PathVariable("id") Integer id){
		return userService.delUser(id);
	}
}
