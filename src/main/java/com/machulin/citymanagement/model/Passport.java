package com.machulin.citymanagement.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    @JsonIgnore
    private Person person;
}
