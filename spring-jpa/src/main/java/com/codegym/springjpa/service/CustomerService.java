package com.codegym.springjpa.service;

import com.codegym.springjpa.model.Customer;
import com.codegym.springjpa.model.StoredCustomer;
import com.codegym.springjpa.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public boolean saveWithStoredProcedure(StoredCustomer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.remove(id);
    }
}