package com.neosoft.service;

import com.neosoft.entity.Order;

import java.util.List;

public interface OrderService {

//    save
    public Order saveOrder(Order order);

//    get by id
    public Order getOrder(int id);

//    get All Info
    public List<Order> getAllOrder();

//  update
    public Order updateOrder(Order order);

//    delete
    public void deleteOrder(int id);

//    get with paging
    public List<Order> getWithPaging(int pageNo, int pageSize);

}
