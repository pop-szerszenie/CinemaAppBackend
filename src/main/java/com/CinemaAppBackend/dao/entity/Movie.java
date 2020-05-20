package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table (name = "movie")

public class Movie {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @NotNull

    @Column(name="movie_id")
    private Long id;
    @Column(name="movie_ttl")
    private String title;
    @Column(name="movie_strr")
    private String Starring;
    @Column(name="movie_info")
    private String info;
    @Column(name="movie_year")
    private LocalDate year;

}
