package com.codegym.springjpa.repository;

import com.codegym.springjpa.model.Customer;
import com.codegym.springjpa.model.StoredCustomer;

public interface ICustomerRepository extends IGenerateRepository<Customer> {
    boolean saveWithStoredProcedure(StoredCustomer customer);
}
