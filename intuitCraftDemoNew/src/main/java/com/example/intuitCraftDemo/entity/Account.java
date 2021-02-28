package com.example.intuitCraftDemo.entity;

import javax.validation.constraints.Pattern;

import javax.persistence.*;

@Entity
@Table(name = "Account")
public class Account {

    private static  final String VALID_REGEX = "^(.+)@(.+)$";


    private long id;
    private String firstName;
    private String lastName;
    @Pattern(regexp = VALID_REGEX,
            message = "Email has invalid character(s)")
    private String emailAddress;
    private Address userAddress;

    public Account() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_ID")
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME", nullable = false, length = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "EMAIL_ADDRESS", unique = true, nullable = false, length = 100)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")
    public Address getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

}