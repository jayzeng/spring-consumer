package com.demo.kafka.consumer;

import com.demo.elasticsearch.model.EsEmployee;
import com.demo.elasticsearch.service.EmployeeService;
import com.demo.kafka.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Consumer {
    Logger logger = LoggerFactory.getLogger(getClass());
    private final EmployeeService employeeService;

    @Autowired
    public Consumer(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @KafkaListener(topics = {"employee"}, groupId = "spring-boot-kafka")
    public void receiveEmployeeRecord(Employee employee) {
        logger.info("received message");
        System.out.println(employee.toString());

        logger.debug("indexing to elasticsearch");

        EsEmployee esEmployee = new EsEmployee();
        esEmployee.id = UUID.randomUUID().toString();
        esEmployee.setFirstName(employee.getFirstName());
        esEmployee.setLastName(employee.getLastName());
        esEmployee.setEmail(employee.getEmail());
        employeeService.save(esEmployee);

        logger.debug("indexed elasticsearch");
    }
}
