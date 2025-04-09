package com.neosoft.controller;

import com.neosoft.entity.Customer;
import com.neosoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //--save customer
    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return  customerService.saveCustomer(customer);
    }

    //--get customer
    @GetMapping("/get/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }

    //--get all customer info
    @GetMapping("/getAll")
    public List<Customer> getAllInfo(){
        return customerService.getAllInfo();
    }

    //--update customer
    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    //--delete customer
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }

    //--get customer with paging
    @GetMapping("/getWithPaging")
    public  List<Customer> getWithPaging(@RequestParam(defaultValue = "0")
                                             int pageNo,@RequestParam(defaultValue = "3") int pageSize){
        return  customerService.getWithPaging(pageNo,pageSize);
    }

}
