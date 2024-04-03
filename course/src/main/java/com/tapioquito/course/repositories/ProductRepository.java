package com.tapioquito.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapioquito.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
