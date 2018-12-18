package com.xinian.controller;

import com.xinian.dao.DepartmentDao;
import com.xinian.dao.EmployeeDao;
import com.xinian.entities.Department;
import com.xinian.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping(value = "/emp")
	public String addEmployee(Employee employee){
		employeeDao.save(employee);
		System.out.println(employee);
		return "redirect:/emps";
	}

	//根据ID获取要修改的用户的信息
	@GetMapping(value = "/emp/{id}")
	public String updateEmp(@PathVariable("id") Integer id,Model model){
		Employee employee = employeeDao.get(id);
		model.addAttribute("emp",employee);
		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts",departments);
		return "emp/add";
	}
	//修改
	@PutMapping(value = "/emp")
	public String upEmp(Employee employee){
		System.out.println("要修改的员工信息：=="+employee);
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	//删除员工的方法
	@DeleteMapping(value = "/emp/{id}")
	public String delEmp(@PathVariable("id") Integer id){
		employeeDao.delete(id);
		return "redirect:/emps";
	}
}
