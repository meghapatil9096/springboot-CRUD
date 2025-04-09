package com.neosoft.repository;

import com.neosoft.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Customer findById(int id);

    public void deleteById(int id);
}
