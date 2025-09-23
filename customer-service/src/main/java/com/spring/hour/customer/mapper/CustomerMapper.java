package com.spring.hour.customer.mapper;

import com.spring.hour.customer.domain.Customer;
import com.spring.hour.customer.features.customer.dto.CreateCustomerRequest;
import com.spring.hour.customer.features.customer.dto.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    // Mapping logic
    // DTOs to Domain Models
    // Domain Models to DTOs
    Customer toCustomer(CreateCustomerRequest dto);

    @Mapping(source = "customerNumber", target = "customerNo")
    CustomerResponse fromCustomer(Customer customer);

}
