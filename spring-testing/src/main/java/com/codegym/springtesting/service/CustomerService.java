package com.codegym.springtesting.service;

import com.codegym.springtesting.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
