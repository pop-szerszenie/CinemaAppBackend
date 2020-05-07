package com.CinemaAppBackend.api;

import com.CinemaAppBackend.dao.entity.Seat;
import com.CinemaAppBackend.manager.SeatManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/seats")

public class SeatAPI {

    private SeatManager sm;

    @Autowired
    public SeatAPI(SeatManager sm){
        this.sm = sm;
    }

    @GetMapping ("/all")
    public Iterable <Seat> getAll(){
        return sm.findAll();
    }

    @GetMapping ()
    public Optional<Seat> getByID(@RequestParam long index){
        return sm.findById(index);
    }

    @GetMapping("/free-seats")
    public List<Seat> getFreeSeats(){
        List<Seat> freeSeats=sm.findSeatsFree();
        return freeSeats;
    }
    @PostMapping("/seat-add")
    public Seat addSeat(@RequestBody Seat seat){
        return sm.save(seat);
    }



}
