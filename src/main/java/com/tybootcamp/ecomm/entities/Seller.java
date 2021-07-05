package com.tybootcamp.ecomm.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("seller")
public class Seller extends User
{
    @Column
    @NotNull
    private String accountId;


    public Seller()
    {
        super();
    }

    public Seller(String accountId)
    {
        this.accountId = accountId;

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

