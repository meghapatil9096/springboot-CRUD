package com.neosoft.service;

import com.neosoft.entity.Customer;

import java.util.List;

public interface CustomerService {

//--save customer
    public Customer saveCustomer(Customer customer);

//--get customer
    public Customer getCustomer(int id);

//--get all customer info
    public List<Customer> getAllInfo();

//--update customer
    public Customer updateCustomer(Customer customer);

//--delete customer
    public void deleteCustomer(int id);

//--get customer with paging
    public  List<Customer> getWithPaging(int pageNo, int pageSize);

}
