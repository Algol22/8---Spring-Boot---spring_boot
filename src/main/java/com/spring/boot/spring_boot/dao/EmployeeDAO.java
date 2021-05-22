package com.spring.boot.spring_boot.dao;

import com.spring.boot.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

   public void saveEmployee(Employee employee);

   public void deleteEmployee(int id);
}
