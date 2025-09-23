package com.spring.hour.customer.client;

import com.spring.hour.customer.client.dto.PostResponse;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface JsonPlaceholderClient {

    @GetExchange("/posts")
    List<PostResponse> getPosts();

}
