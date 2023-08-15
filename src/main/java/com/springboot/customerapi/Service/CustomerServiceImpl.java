package com.springboot.customerapi.Service;

import com.springboot.customerapi.entity.Customer;
import com.springboot.customerapi.exception.CustomerNotFoundException;
import com.springboot.customerapi.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String createCustomer(Customer customer) {
        //More Business Logic
        customerRepository.save(customer);
        return "success";
    }

    @Override
    public String updateCustomer(Customer customer) {
        //More Business Logic
        customerRepository.save(customer);
        return "success";
    }

    @Override
    public String deleteCustomer(long id) {
        //More Business Logic
        customerRepository.deleteById(id);
        return "success";
    }

    @Override
    public Customer getCustomer(long id) {
        if(customerRepository.findById(id).isEmpty())
            throw new CustomerNotFoundException("Requested Customer does not exist");
         return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        //More Business Logic
        return customerRepository.findAll();
    }
}
