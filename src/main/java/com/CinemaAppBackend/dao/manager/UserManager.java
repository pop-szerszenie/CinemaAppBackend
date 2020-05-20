package com.CinemaAppBackend.dao.manager;

import com.CinemaAppBackend.dao.entity.User;
import com.CinemaAppBackend.dao.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserManager {

        UserRepo userRepo;

        @Autowired
        public UserManager(UserRepo userRepo) {
            this.userRepo = userRepo;
        }

        public Iterable<User> findAll (){
            return userRepo.findAll();
        }

        public Optional<User> findById (Long id){
            return userRepo.findById(id);
        }

        public User addUser(User user) {
            return userRepo.save(user);
        }

        public void updateUser(User user, long id) {
            userRepo.editUser(user.getFirstName(),user.getLastName(),user.getPassword(),id);
        }
}

