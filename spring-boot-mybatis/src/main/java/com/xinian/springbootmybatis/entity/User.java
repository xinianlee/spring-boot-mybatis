package com.xinian.springbootmybatis.entity;


import lombok.Data;

/**
 * @author xinian
 * @date 2018/12/31 1:00
 */

@Data
public class User {
	private Integer id;
	private String name;
	private String phone;
	private String email;
	private String gender;
}
