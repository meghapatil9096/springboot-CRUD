package com.neosoft.service;

import com.neosoft.entity.Customer;
import com.neosoft.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getAllInfo() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getWithPaging(int pageNo, int pageSize) {
        PageRequest pageRequest= PageRequest.of(pageNo,pageSize);
        Page pageResult = customerRepository.findAll(pageRequest);

        if (pageResult.hasContent())
        {
            return pageResult.getContent();
        }
        else {
            return new ArrayList<>();
        }
    }
}
