package com.tybootcamp.ecomm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.bind.v2.TODO;
import com.tybootcamp.ecomm.enums.Gender;
import com.tybootcamp.ecomm.enums.UserType;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Profile
{
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(nullable = false)
    @MapsId
    @JsonIgnore
    private User user;


    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String website;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private String address;

    private String emailAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Profile()
    {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Profile(User user, @NotNull String firstName, @NotNull String lastName, Gender gender, UserType userType) {
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.userType = userType;
    }


    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }


    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
}
