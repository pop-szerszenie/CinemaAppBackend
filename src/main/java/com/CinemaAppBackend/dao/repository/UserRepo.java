package com.CinemaAppBackend.dao.repository;

import com.CinemaAppBackend.dao.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository

    public interface UserRepo extends CrudRepository<User, Long> {

        @Modifying
        @Transactional
        @Query("update User u " +
                "set u.firstName = :firstName, u.lastName = :lastName, u.password = :password " +
                "where u.id =:id")
        void editUser(@Param("firstName") String firstName, @Param("lastName") String lastName,
                             @Param("password") String password, @Param("id") Long id);

    }
