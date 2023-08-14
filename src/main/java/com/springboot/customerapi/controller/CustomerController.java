package com.springboot.customerapi.controller;

import com.springboot.customerapi.Service.CustomerService;
import com.springboot.customerapi.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{id}")
    public Customer getCreateCustomerDetails(@PathVariable("id") long id){
        return  customerService.getCustomer(id);
    }
    @PostMapping
    public String createCustomerDetails(@RequestBody Customer customer){
         customerService.createCustomer(customer);
        return  "Customer created successfully";
    }
    @PutMapping
    public String updateCustomerDetails(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
        return "Customer updated successfully";
    }
    @DeleteMapping("{id}")
    public String deleteCustomerDetails(@PathVariable("id") long id){
        customerService.deleteCustomer(id);
        return "Customer deleted successfully";
    }
    @GetMapping
    public List<Customer> getAllCustomerDetails(){
        return customerService.getAllCustomers();
    }
}
