package com.machulin.citymanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    @OneToOne
    private Passport  passport;
}
