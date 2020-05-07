package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="custom")
public class Customer {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "custom_ID")
    private long id;
    @Column(name = "custom_F_NAME")
    private String firstName;
    @Column(name = "custom_L_NAME")
    private String lastName;
    @Column(name = "custom_EML")
    private String email;
    @Column(name = "custom_PASS")
    private String password;

    public Customer() {
    }

    public Long getId() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
