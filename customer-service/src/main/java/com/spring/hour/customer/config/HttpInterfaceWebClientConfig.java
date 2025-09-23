package com.spring.hour.customer.config;

import com.spring.hour.customer.client.JsonPlaceholderClient;
import com.spring.hour.customer.client.PlatziFakeStoreClient;
import com.spring.hour.customer.util.HttpInterfaceWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class HttpInterfaceWebClientConfig {

    private final HttpInterfaceWebClient httpInterfaceWebClient;

    @Bean
    public PlatziFakeStoreClient platziFakeStoreClient() {
        return httpInterfaceWebClient
                .createClient(
                        "https://api.escuelajs.co/api/v1",
                        PlatziFakeStoreClient.class
                );
    }

    @Bean
    public JsonPlaceholderClient jsonPlaceholderClient() {
        return httpInterfaceWebClient
                .createClient(
                        "https://jsonplaceholder.typicode.com",
                        JsonPlaceholderClient.class
                );
    }

}
