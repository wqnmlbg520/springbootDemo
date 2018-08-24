package com.quantumcloud.bonus.service.impl;

        import com.quantumcloud.bonus.mapper.EmployeeMapper;
        import com.quantumcloud.bonus.model.Employee;
        import com.quantumcloud.bonus.service.EmployeeService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询员工信息
     * @param id
     * @return
     */
    @Override
    public Employee selectEmployee(int id) {
        return employeeMapper.getEmployee(id);
    }
}
