package com.portela.springjpa.services;

import com.portela.springjpa.entities.Order;
import com.portela.springjpa.entities.User;
import com.portela.springjpa.repositories.OrderRepository;
import com.portela.springjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
