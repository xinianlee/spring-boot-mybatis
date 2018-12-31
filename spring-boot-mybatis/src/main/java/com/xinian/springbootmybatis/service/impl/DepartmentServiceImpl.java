package com.xinian.springbootmybatis.service.impl;

import com.xinian.springbootmybatis.entity.Department;
import com.xinian.springbootmybatis.mapper.DepartmentMapper;
import com.xinian.springbootmybatis.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xinian
 * @date 2018/12/31 13:54
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public Department getDepartmentById(Integer id) {
		return departmentMapper.getDepartmentById(id);
	}

	@Override
	public int saveDepartment(Department dept) {
		return departmentMapper.saveDepartment(dept);
	}

	@Override
	public int updateDepartment(Department dept) {
		return departmentMapper.updateDepartment(dept);
	}

	@Override
	public int removeDepartment(Integer id) {
		return departmentMapper.removeDepartment(id);
	}
}
