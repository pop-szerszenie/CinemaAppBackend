package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table (name = "seance")

public class Seance {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    @Column(name="seance_ID")
    private Long id;
    @Column(name="seance_DATE")
    private LocalDate date;
    @Column(name="seance_TIME")
    private LocalDate time;

    public Seance() {
    }
}
