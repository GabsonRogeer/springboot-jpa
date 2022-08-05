package com.portela.springjpa.repositories;

import com.portela.springjpa.entities.Category;
import com.portela.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
