package com.mybatis.mapper;

import com.mybatis.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> selectAll();

    int save(Employee employee);
}
