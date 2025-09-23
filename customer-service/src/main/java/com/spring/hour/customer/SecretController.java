package com.spring.hour.customer;

import com.spring.hour.customer.config.props.DatabaseProps;
import com.spring.hour.customer.config.props.ServiceInfoProps;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class SecretController {

    private final ServiceInfoProps serviceInfoProps;
    private final DatabaseProps databaseProps;

    @GetMapping("/secrets")
    public Map<String, Object> secret() {
        return Map.of("info", serviceInfoProps.getInfo(),
                "version", serviceInfoProps.getVersion(),
                "url", databaseProps.getUrl(),
                "username", databaseProps.getUsername(),
                "password", databaseProps.getPassword());
    }

}
