package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;

import java.time.LocalDate;
@Entity
@Table (name = "seance")

public class Seance {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    @Column(name="seance_id")
    private Long id;
    @Column(name="seance_sdate")
    private LocalDate startDate;
    @Column(name="seance_edate")
    private LocalDate endDate;
    @Column(name="seance_time")
    private LocalDate startTime;

    public Seance() {
    }
}
