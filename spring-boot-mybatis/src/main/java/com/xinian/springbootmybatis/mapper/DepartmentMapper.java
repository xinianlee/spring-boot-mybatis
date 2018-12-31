package com.xinian.springbootmybatis.mapper;

import com.xinian.springbootmybatis.entity.Department;

/**
 * @author xinian
 * @date 2018/12/31 13:30
 */
public interface DepartmentMapper {

	Department getDepartmentById(Integer id);

	int saveDepartment(Department dept);

	int updateDepartment(Department dept);

	int removeDepartment(Integer id);
}
