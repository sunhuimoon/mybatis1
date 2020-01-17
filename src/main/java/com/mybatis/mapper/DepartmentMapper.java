package com.mybatis.mapper;

import com.mybatis.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    public List<Department> selectAll();

    @Select("select * from department where id=#{id}")
    public Department selectById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int save(Department department);

    @Update("update department set departmentName=#{departmentName}")
    public int update(Department department);

    @Delete("delete from department where id =#{id}")
    public int delete(Integer id);
}
