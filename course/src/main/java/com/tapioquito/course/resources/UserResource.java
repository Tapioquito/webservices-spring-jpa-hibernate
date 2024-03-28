package com.tapioquito.course.resources;

import org.springframework.web.bind.annotation.RestController;

import com.tapioquito.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
/* import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam; */
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/users"/* , method=RequestMethod.GET */)

public class UserResource {
    @GetMapping

    public ResponseEntity<User> findAll() {

        User u = new User(1L, "Maria", "maria@gmail.com", "988876764", "1234245");
        return ResponseEntity.ok().body(u);
    }

}
