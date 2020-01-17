package com.mybatis.controller;

import com.mybatis.entity.Department;
import com.mybatis.mapper.DepartmentMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DepartmentController {

    @Resource
    private DepartmentMapper departmentMapper;

    @RequestMapping("/dep/{id}")
    public List<Department> getDepById(@PathVariable Integer id) {
        return departmentMapper.selectAll();
    }

    @RequestMapping("/dep")
    public Department getDepById(Department department) {
        departmentMapper.save(department);
        return department;
    }
}
