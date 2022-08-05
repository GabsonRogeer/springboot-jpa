package com.portela.springjpa.repositories;

import com.portela.springjpa.entities.OrderItem;
import com.portela.springjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
