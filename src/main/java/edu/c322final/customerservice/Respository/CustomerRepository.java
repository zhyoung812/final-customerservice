package edu.c322final.customerservice.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.c322final.customerservice.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {



}
