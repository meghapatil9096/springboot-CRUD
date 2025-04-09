package com.neosoft.controller;

import com.neosoft.entity.Order;
import com.neosoft.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer_order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //    save operation
    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    //    get by id operation
    @GetMapping("/get/{id}")
    public Order getOrder(@PathVariable int id){
        return orderService.getOrder(id);
    }

    //    get All Info
    @GetMapping("/getall")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }

    //  update operation
    @PutMapping("/update")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

    //    delete operation
    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable int id){
        orderService.deleteOrder(id);
    }

    //    get with paging
    @GetMapping("/getwithPaging")
    public List<Order> getWithPaging(@RequestParam(defaultValue = "0") int pageNo,
                                     @RequestParam(defaultValue = "3") int pageSize){
        return orderService.getWithPaging(pageNo,pageSize);
    }

}
