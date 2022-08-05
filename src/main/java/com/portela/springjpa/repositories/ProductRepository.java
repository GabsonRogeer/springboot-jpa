package com.portela.springjpa.repositories;

import com.portela.springjpa.entities.Category;
import com.portela.springjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
