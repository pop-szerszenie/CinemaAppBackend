package com.CinemaAppBackend.dao.entity;

import javax.persistence.*;


@Entity
@Table(name="seat")
public class Seat {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id


    @Column(name="seat_id")
    private Long id;
    @Column(name="seat_row")
    private int row;
    @Column(name="seat_plc")
    private int place;
    @Column(name="seat_sts")
    private int status; // 1 free, 0 - reserved (time after type button "Reservation" and before purchase), -1 - booking


    public Seat(){
    }

    public Seat(long id, int row, int place, int status) {
        this.id = id;
        this.row = row;
        this.place = place;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
