package com.tapioquito.course.resources;

import org.springframework.web.bind.annotation.RestController;

import com.tapioquito.course.entities.User;
import com.tapioquito.course.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/users"/* , method=RequestMethod.GET */)

public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {

        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }

}
