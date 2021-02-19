package ru.pronnikov.spring_learn.consuming_rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Data {

    @JsonProperty("id")
    public int id;

    @JsonProperty("employee_name")
    public String employeeName;

    @JsonProperty("employee_salary")
    public int employeeSalary;

    @JsonProperty("employee_age")
    public int employeeAge;

}
