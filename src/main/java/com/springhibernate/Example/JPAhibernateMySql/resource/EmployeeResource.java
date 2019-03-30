package com.springhibernate.Example.JPAhibernateMySql.resource;

import com.springhibernate.Example.JPAhibernateMySql.Model.Employee;
import com.springhibernate.Example.JPAhibernateMySql.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeResource {

    @Autowired
    EmployeeRepository empRepository;

    @GetMapping("/all")
    public List<Employee> getAll(){
        return empRepository.findAll();
    }
}
