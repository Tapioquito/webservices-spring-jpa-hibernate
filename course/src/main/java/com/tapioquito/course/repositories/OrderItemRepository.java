package com.tapioquito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapioquito.course.entities.OrderItem;
import com.tapioquito.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
