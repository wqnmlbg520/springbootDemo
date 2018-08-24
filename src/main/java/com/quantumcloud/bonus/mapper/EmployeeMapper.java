package com.quantumcloud.bonus.mapper;


import com.quantumcloud.bonus.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EmployeeMapper {
    Employee getEmployee(int userId);
}
