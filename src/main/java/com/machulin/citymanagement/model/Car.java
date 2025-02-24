package com.machulin.citymanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Car {


    @Id
    @GeneratedValue
    private Long id;


    private String mark;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
