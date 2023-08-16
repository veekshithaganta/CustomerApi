package com.springboot.customerapi.controller;

import com.springboot.customerapi.Service.CustomerService;
import com.springboot.customerapi.customresponse.ResponseHandler;
import com.springboot.customerapi.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    //Reads the Specific customer details
    @GetMapping("{id}")
    public ResponseEntity<Object> getCreateCustomerDetails(@PathVariable("id") long id){
      return  ResponseHandler.responseBuilder("Requested customer details are given here",
                HttpStatus.OK,customerService.getCustomer(id));
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
    //Reads All Customer details
    @GetMapping
    public List<Customer> getAllCustomerDetails(){
        return customerService.getAllCustomers();
    }
}
