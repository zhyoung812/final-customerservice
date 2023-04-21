package edu.c322final.customerservice.Controller;

import edu.c322final.customerservice.Respository.CustomerRepository;
import edu.c322final.customerservice.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    public CustomerRepository customerRepository;


    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerRepository.getReferenceById(id);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public int createCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return newCustomer.getId();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerRepository.deleteById(id);


    }
















}
