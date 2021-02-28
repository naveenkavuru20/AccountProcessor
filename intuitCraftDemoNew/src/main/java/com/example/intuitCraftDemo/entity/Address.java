package com.example.intuitCraftDemo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String street;
    private String city;
    private String provinceState;
    private String country;

    public Address() {
    }

    public Address(String street, String city, String provinceState, String country) {
        this.street = street;
        this.city = city;
        this.provinceState = provinceState;
        this.country = country;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    public long getId() {
        return this.id;
    }

    public void setId(long addressId) {
        this.id = addressId;
    }

    @Column(name = "STREET", nullable = false, length=250)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "CITY", nullable = false, length=50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "PROVINCE_STATE", nullable = false, length=50)
    public String getProvinceState() {
        return this.provinceState;
    }

    public void setProvinceState(String provinceState) {
        this.provinceState = provinceState;
    }

    @Column(name = "COUNTRY", nullable = false, length=10)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
