package com.tybootcamp.ecomm.entities;

import com.tybootcamp.ecomm.enums.UserType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value = "customer")
public class Customer extends User{
    @Enumerated(value = EnumType.STRING)
    private UserType userType;
    @Column
    @NotNull
    private String name;



    public Customer(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }



