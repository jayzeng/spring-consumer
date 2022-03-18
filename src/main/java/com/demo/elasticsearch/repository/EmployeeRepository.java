package com.demo.elasticsearch.repository;

import com.demo.elasticsearch.model.EsEmployee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EmployeeRepository extends ElasticsearchRepository<EsEmployee, String> {
}
