package com.employeeapp.employeeservice.employee;

import com.addressapp.addressservice.address.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto save(Employee employee) {

        EmployeeDto employeeDto = employeeMapper.employeeToEmployeeDto(employee);
        Address address = new Address();
        address.setStreet(employee.getAddress().getStreet());
        address.setState(employee.getAddress().getState());
        address.setCity(employee.getAddress().getCity());
        employeeRepository.save(employee);
        return employeeDto;
    }

    @Override
    public EmployeeDto getById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Employee was not found."));
        return employeeMapper.employeeToEmployeeDto(employee);
    }
}
