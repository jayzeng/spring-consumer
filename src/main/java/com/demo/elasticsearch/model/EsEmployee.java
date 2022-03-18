package com.demo.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(indexName = "employee")
public class EsEmployee {
    @Id
    public String id;

    @Field(type = FieldType.Text, name="first_name")
    public String firstName;

    @Field(type = FieldType.Text, name="last_name")
    public String lastName;

    @Field(type = FieldType.Text, name="email")
    public String email;
}
