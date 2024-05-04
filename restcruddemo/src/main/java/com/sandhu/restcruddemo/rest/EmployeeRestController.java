package com.sandhu.restcruddemo.rest;

import com.sandhu.restcruddemo.dao.EmployeeDAO;
import com.sandhu.restcruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "./api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theDAO){
        employeeDAO = theDAO;
    }

    @GetMapping(name = "/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
