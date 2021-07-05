package com.tybootcamp.ecomm.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User{

    @Column
    @NotNull
    private String name;

    public Customer(){
        super();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
