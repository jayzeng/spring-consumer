package com.demo.kafka.model;

import lombok.Data;

@Data
public class Employee {
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
}
