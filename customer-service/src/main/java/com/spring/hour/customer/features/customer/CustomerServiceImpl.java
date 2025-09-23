package com.spring.hour.customer.features.customer;

import com.spring.hour.customer.domain.Customer;
import com.spring.hour.customer.features.customer.dto.CreateCustomerRequest;
import com.spring.hour.customer.features.customer.dto.CustomerResponse;
import com.spring.hour.customer.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service(value = "customerServiceImpl")
@RequiredArgsConstructor
public class CustomerServiceImpl implements
        CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest) {

        Customer customer = customerMapper.toCustomer(createCustomerRequest);
        customer.setCustomerNumber(UUID.randomUUID().toString());
        customer.setCreatedAt(LocalDateTime.now());
        customer.setUpdatedAt(LocalDateTime.now());

        // Insert into database
        customer = customerRepository.save(customer);

        return customerMapper.fromCustomer(customer);
    }

    @Override
    public List<CustomerResponse> getCustomers() {

        List<Customer> customers = customerRepository.findAll();

        return customers
                .stream()
                .map(customerMapper::fromCustomer)
                .toList();
    }

}
