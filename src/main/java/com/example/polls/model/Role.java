package com.example.polls.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
@Entity
@Table (name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;

    public Role() {

    }
    public Role(RoleName name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public RoleName getName() {
        return name;
    }
}
