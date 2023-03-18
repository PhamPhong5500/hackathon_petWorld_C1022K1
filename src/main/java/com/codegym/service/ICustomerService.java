package com.codegym.service;

import com.codegym.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<CustomerDto> getCustomers();
    CustomerDto saveCustomer(CustomerDto customer);
    void deleteCustomer(Long id);
   CustomerDto getCustomer(Long id);
}
