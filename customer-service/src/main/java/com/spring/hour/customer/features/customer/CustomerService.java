package com.spring.hour.customer.features.customer;

import com.spring.hour.customer.features.customer.dto.CreateCustomerRequest;
import com.spring.hour.customer.features.customer.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {

    CustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest);

    List<CustomerResponse> getCustomers();

    //List<CustomerResponse> getCustomersByProvider(String providerId);

}
