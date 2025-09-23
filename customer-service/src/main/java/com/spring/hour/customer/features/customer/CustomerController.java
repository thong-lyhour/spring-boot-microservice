package com.spring.hour.customer.features.customer;

import com.spring.hour.customer.features.customer.dto.CreateCustomerRequest;
import com.spring.hour.customer.features.customer.dto.CustomerResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerServiceImpl;


    @PostMapping
    public CustomerResponse createCustomer(@RequestBody @Valid CreateCustomerRequest createCustomerRequest) {
        return customerServiceImpl.createCustomer(createCustomerRequest);
    }


    @GetMapping("/public")
    public List<CustomerResponse> getCustomerPublic() {
        return customerServiceImpl.getCustomers();
    }

    @GetMapping("/private")
    public CustomerResponse getCustomerPrivate() {
        return new CustomerResponse("1", "Private", "Cust", ";flakdsjf");
    }

}
