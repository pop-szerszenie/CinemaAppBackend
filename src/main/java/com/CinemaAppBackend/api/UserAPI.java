package com.CinemaAppBackend.api;


import com.CinemaAppBackend.dao.entity.User;
import com.CinemaAppBackend.dao.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("api/users")

public class UserAPI {
        private UserManager userManager;

        @Autowired
        public UserAPI(UserManager userManager){
            this.userManager = userManager;
        }

    @GetMapping()
    public Iterable<User> getAll() {
        return userManager.findAll();

    }

    @PostMapping("/sign_up")
    public User signUp(@RequestBody User user) {
        return userManager.addUser(user);
    }

    @PutMapping("/{id}")
    public Optional<User> editUser(@RequestBody User user, @PathVariable ("id") long id){
            userManager.updateUser (user, id);
            return userManager.findById(id);
    }

}
