package com.springhibernate.Example.JPAhibernateMySql.Repository;

import com.springhibernate.Example.JPAhibernateMySql.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
