package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
