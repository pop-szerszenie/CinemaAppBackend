package com.CinemaAppBackend.manager;

import com.CinemaAppBackend.dao.repository.SeatRepo;
import com.CinemaAppBackend.dao.entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


//Klasa odpowiada za polączenie bazy dnych i warstwy API

@Service
public class SeatManager {
    SeatRepo seatRepo;

    @Autowired
    public SeatManager(SeatRepo seatRepo) {
        this.seatRepo = seatRepo;
    }

    public Iterable<Seat> findAll (){
        return seatRepo.findAll();
    }

    public Optional<Seat> findById (Long id){
        return seatRepo.findById(id);
    }

    public List<Seat> findSeatsFree(){
        List<Seat> freeSeats= seatRepo.findByStatus(1);
        return freeSeats;
    }


    public Seat save(Seat seat) {
        return seatRepo.save(seat);
    }
}
