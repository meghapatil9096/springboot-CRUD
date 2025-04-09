package com.neosoft.repository;

import com.neosoft.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    public Order findById(int id);

    public void deleteById(int id);

}
