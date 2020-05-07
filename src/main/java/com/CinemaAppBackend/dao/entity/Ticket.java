package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")

public class Ticket {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name="tickets_ID")
    private Long id;

    public Ticket() {
    }
}
