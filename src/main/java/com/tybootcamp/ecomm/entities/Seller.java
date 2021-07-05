package com.tybootcamp.ecomm.entities;

import com.tybootcamp.ecomm.enums.UserType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value = "seller")
public class Seller extends User
{
    @Enumerated(value = EnumType.STRING)
    private UserType userType;
    @Column
    @NotNull
    private String accountId;



    public Seller()
    {
    }





    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }


}

