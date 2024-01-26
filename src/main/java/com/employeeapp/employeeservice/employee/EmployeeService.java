package com.employeeapp.employeeservice.employee;

public interface EmployeeService {

    EmployeeDto save(Employee employee);

    EmployeeDto getById(Long id);

}
