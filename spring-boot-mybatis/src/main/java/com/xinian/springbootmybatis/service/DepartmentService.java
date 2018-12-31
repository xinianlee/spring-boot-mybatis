package com.xinian.springbootmybatis.service;

import com.xinian.springbootmybatis.entity.Department;

/**
 * @author xinian
 * @date 2018/12/31 13:53
 */
public interface DepartmentService {

	Department getDepartmentById(Integer id);

	int saveDepartment(Department dept);

	int updateDepartment(Department dept);

	int removeDepartment(Integer id);
}
