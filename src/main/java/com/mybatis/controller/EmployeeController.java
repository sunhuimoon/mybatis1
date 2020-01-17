package com.mybatis.controller;

import com.mybatis.entity.Employee;
import com.mybatis.mapper.EmployeeMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmployeeController {

    @Resource
    private EmployeeMapper employeeMapper;

    @RequestMapping("/emp/list")
    public List<Employee> getALl() {
        return employeeMapper.selectAll();
    }

    @RequestMapping("/emp/{id}")
    public Employee save(Employee employee) {
        employeeMapper.save(employee);
        return employee;
    }
}
