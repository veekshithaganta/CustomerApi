package com.springboot.customerapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_info")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String firstName;
    public String lastName;
    public String email;
    public String address;

    public Customer() {
    }

   //As we are using auto generation for id we don't need it in constructor
    public Customer( String firstName, String lastName, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
