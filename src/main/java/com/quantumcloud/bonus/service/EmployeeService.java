package com.quantumcloud.bonus.service;

import com.quantumcloud.bonus.model.Employee;

public interface EmployeeService {

    /**
     * 查询员工信息
     * @param id
     * @return
     */
    public Employee selectEmployee(int id);

}
