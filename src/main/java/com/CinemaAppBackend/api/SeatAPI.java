package com.CinemaAppBackend.api;

import com.CinemaAppBackend.dao.entity.Seat;
import com.CinemaAppBackend.dao.manager.SeatManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/seats")

public class SeatAPI {

    private SeatManager seatManager;

    @Autowired
    public SeatAPI(SeatManager seatManager){
        this.seatManager = seatManager;
    }

    @GetMapping ()
    public Iterable <Seat> getAll(){
        return seatManager.findAll();
    }

    @GetMapping("/free")
    public List<Seat> getFreeSeats(){
        return seatManager.findSeatsFree();
    }

    @GetMapping ("/{id}")
    public Optional<Seat> getByID(@PathVariable("id") long id){
        return seatManager.findById(id);
    }

}
