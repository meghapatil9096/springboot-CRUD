package com.neosoft.service;

import com.neosoft.entity.Customer;
import com.neosoft.entity.Order;
import com.neosoft.repository.CustomerRepository;
import com.neosoft.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImp implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Order saveOrder(Order order) {
        // Ensure customer is not null and is attached properly
        int customerId = order.getCustomer().getId();
        Customer customer = customerRepository.findById(customerId);

        if (customer != null) {
            order.setCustomer(customer);
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Customer not found with ID: " + customerId);
        }
    }

    @Override
    public Order getOrder(int id) {
       return orderRepository.findById(id);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getWithPaging(int pageNo, int pageSize) {

        PageRequest pageRequest = PageRequest.of(pageNo,pageSize);
        Page<Order> pageResult = orderRepository.findAll(pageRequest);

        if (pageResult.hasContent())
        {
            return pageResult.getContent();
        }
        else {
            return new ArrayList<>();
        }
    }
}
