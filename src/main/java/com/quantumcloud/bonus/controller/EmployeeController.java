package com.quantumcloud.bonus.controller;


import com.quantumcloud.bonus.exception.ExceptionEnum;
import com.quantumcloud.bonus.model.Employee;
import com.quantumcloud.bonus.model.ResponseResult;
import com.quantumcloud.bonus.service.EmployeeService;
import com.quantumcloud.bonus.exception.NoFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.quantumcloud.model"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @RequestMapping(value = "selectEmployee/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult selectEmployee(@PathVariable int id, HttpServletResponse httpServletResponse) throws Exception {
        Employee employee = employeeService.selectEmployee(id);
        logger.info("访问selectEmployee/{id}接口，id = " + "id");
        if (employee == null) {
            logger.error("根据员工工号，查询员工异常：e=" + ExceptionEnum.ERROR_NOFOUND.getValue());
            throw new NoFoundException(ExceptionEnum.ERROR_NOFOUND.getValue());
        }else {
            return new ResponseResult(id,true,"success",employee);
        }

    }

}
