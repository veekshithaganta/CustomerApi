package com.springboot.customerapi.Service;

import com.springboot.customerapi.entity.Customer;
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
        customerRepository.save(customer);
        return "success";
    }

    @Override
    public String updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return "success";
    }

    @Override
    public String deleteCustomer(long id) {
        customerRepository.deleteById(id);
        return "success";
    }

    @Override
    public Customer getCustomer(long id) {
         return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
