package com.codegym.springtesting.service.impl;

import com.codegym.springtesting.model.Customer;
import com.codegym.springtesting.service.CustomerService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleCustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>();
    }
}
