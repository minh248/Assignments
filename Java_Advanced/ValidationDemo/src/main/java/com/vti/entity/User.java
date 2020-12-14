package com.vti.entity;


import com.vti.validation.Age;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private short id;
    
    private String name;

    private String email;

    @Age(min = 19)
    private LocalDate birthDay;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
