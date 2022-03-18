package com.demo.elasticsearch.service;

import com.demo.elasticsearch.model.EsEmployee;
import com.demo.elasticsearch.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public void save(EsEmployee employee) {
        employeeRepository.save(employee);
    }

    public void delete(EsEmployee employee) {
        employeeRepository.delete(employee);
    }
}
