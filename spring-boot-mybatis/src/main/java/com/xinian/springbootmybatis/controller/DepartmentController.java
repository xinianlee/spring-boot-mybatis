package com.xinian.springbootmybatis.controller;

import com.xinian.springbootmybatis.entity.Department;
import com.xinian.springbootmybatis.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinian
 * @date 2018/12/31 13:56
 */
@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable("id") Integer id){
		return departmentService.getDepartmentById(id);
	}

	@PostMapping(value = "/dept/department")
	public int saveDepartment(Department department){
		return departmentService.saveDepartment(department);
	}

	//其他同理
}
