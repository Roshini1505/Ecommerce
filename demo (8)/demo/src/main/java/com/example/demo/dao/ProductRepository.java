package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ProductEntity;

@Repository

public interface ProductRepository extends JpaRepository<ProductEntity, String>{
	

}
