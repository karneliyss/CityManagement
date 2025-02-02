package com.machulin.citymanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Car> cars;
}
