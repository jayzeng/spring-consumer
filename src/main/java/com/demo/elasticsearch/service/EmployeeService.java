package com.demo.elasticsearch.service;

import com.demo.elasticsearch.model.EsEmployee;

public interface EmployeeService {
    void save(EsEmployee employee);
    void delete(EsEmployee employee);
}
