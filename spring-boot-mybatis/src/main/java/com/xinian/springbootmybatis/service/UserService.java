package com.xinian.springbootmybatis.service;

import com.xinian.springbootmybatis.entity.User;

/**
 * @author xinian
 * @date 2018/12/31 1:44
 */
public interface UserService {


	User getUserById(Integer id);

	int insertUser(User user);

	int updateUser(User user);

	int delUser(Integer id);
}
