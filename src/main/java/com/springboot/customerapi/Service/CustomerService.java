package com.springboot.customerapi.Service;

import com.springboot.customerapi.entity.Customer;

import java.util.List;

public interface CustomerService {
    public String createCustomer(Customer customer);
    public String updateCustomer(Customer customer);
    public String deleteCustomer(long id);
    public Customer getCustomer(long id);
    public List<Customer>  getAllCustomers();
}
