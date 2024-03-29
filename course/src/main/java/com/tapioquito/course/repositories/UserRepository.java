package com.tapioquito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapioquito.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
