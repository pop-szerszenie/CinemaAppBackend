package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")

public class Ticket {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name="ticket_ID")
    private Long id;
    @Column(name="ticket_time")
    private LocalDate time;

    public Ticket() {
    }
}
