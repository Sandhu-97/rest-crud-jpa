package com.sandhu.restcruddemo.dao;

import com.sandhu.restcruddemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
