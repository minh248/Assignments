package com.vti.entity;

import javax.persistence.*;

@Entity
@Table(name = "address", catalog = "lesson5_AdJava")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy = "address")
    private User user;

}
