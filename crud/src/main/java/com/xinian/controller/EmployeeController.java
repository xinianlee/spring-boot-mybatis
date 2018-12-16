package com.xinian.controller;

import com.xinian.dao.DepartmentDao;
import com.xinian.dao.EmployeeDao;
import com.xinian.entities.Department;
import com.xinian.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author xinian
 * @date 2018/12/16 20:36
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	DepartmentDao departmentDao;

	//获取所有员工信息
	@GetMapping(value = "/emps")
	public String getAlls(Model model){
		Collection<Employee> employees = employeeDao.getAll();
		model.addAttribute("emps",employees);
		return "emp/list";
	}

	//去往添加员工的页面.
	@GetMapping(value = "/emp")
	public String toAddEmployee(ModelMap map){
		Collection<Department> departments = departmentDao.getDepartments();
		map.addAttribute("depts",departments);
		return "emp/add";
	}
}
