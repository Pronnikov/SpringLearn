package ru.pronnikov.spring_learn.relational_data_access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {

    private long id;
    private String firstName;
    private String lastName;

}
