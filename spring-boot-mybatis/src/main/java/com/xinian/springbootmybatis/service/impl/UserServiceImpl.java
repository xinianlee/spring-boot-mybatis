package com.xinian.springbootmybatis.service.impl;

import com.xinian.springbootmybatis.entity.User;
import com.xinian.springbootmybatis.mapper.UserMapper;
import com.xinian.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xinian
 * @date 2018/12/31 1:48
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public int insertUser(User user) {
		return userMapper.inserUser(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public int delUser(Integer id) {
		return userMapper.delUser(id);
	}

	@Override
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}
}
