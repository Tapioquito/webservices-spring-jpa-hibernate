package com.tapioquito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapioquito.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
