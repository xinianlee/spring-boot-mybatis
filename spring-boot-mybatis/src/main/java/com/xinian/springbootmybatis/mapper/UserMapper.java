package com.xinian.springbootmybatis.mapper;

import com.xinian.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @author xinian
 * @date 2018/12/31 1:25
 */
public interface UserMapper {

	@Select("select * from user where id=#{id}")
	User getUserById(Integer id);

	@Options(useGeneratedKeys = true,keyProperty ="id")
	@Insert("insert into user(name,gender,phone,email) values (#{name},#{gender},#{phone},#{email})")
	int inserUser(User user);

	@Update("update user set name=#{name},gender=#{gender},phone=#{gender},email=#{email} where id=#{id}")
	int updateUser(User user);

	@Delete("delete from user where id=#{id}")
	int delUser(Integer id);
}
