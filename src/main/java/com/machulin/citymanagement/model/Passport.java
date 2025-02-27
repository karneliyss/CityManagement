package com.machulin.citymanagement.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter


public class Passport {

    @Id
    @GeneratedValue
    private Long id;
    private Long number;



    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
