package com.spring.hour.customer.features.mock;

import com.spring.hour.customer.client.JsonPlaceholderClient;
import com.spring.hour.customer.client.dto.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mock")
@RequiredArgsConstructor
public class MockController {

    private final JsonPlaceholderClient jsonPlaceholderClient;

    @GetMapping("/posts")
    public List<PostResponse> getPosts() {
        return jsonPlaceholderClient.getPosts();
    }

}
