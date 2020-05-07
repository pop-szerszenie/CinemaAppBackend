package com.CinemaAppBackend.dao.repository;

import com.CinemaAppBackend.dao.entity.Seat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SeatRepo extends CrudRepository<Seat, Long> {

    @Query("from Seat s where s.status = :status")
    List<Seat> findByStatus(@Param("status") int status);
}
