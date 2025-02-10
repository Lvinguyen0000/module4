package com.codegym.springjpa.service;

import com.codegym.springjpa.model.Customer;
import com.codegym.springjpa.model.StoredCustomer;

public interface ICustomerService extends IGenerateService<Customer>{
    boolean saveWithStoredProcedure(StoredCustomer customer);
}