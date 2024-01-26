package com.employeeapp.employeeservice.employee;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeMapperTest {



   @Test
    public void shouldMapEmployeeToEmployeeDto(){
       //given
       Employee employee = new Employee(1L, "James Bond", "james@gmail.com");

       //when
       EmployeeDto employeeDto = EmployeeMapper.INSTANCE.employeeToEmployeeDto(employee);

       //then
       assertThat(employeeDto).isNotNull();
       assertThat(employeeDto.getId()).isEqualTo(1L);
       assertThat(employeeDto.getName()).isEqualTo("James Bond");
       assertThat(employeeDto.getEmail()).isEqualTo("james@gmail.com");
   }

}