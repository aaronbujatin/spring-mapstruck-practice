package com.employeeapp.employeeservice.employee;


import org.springframework.stereotype.Service;

@Service
public class EmployeeMapperImpl implements EmployeeMapper{

    @Override
    public EmployeeDto employeeToEmployeeDto(Employee employee) {
        if(employee == null){
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setEmail(employee.getEmail());

        return employeeDto;
    }
}
