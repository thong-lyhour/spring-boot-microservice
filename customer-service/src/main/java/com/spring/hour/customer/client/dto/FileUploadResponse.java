package com.spring.hour.customer.client.dto;

public record FileUploadResponse(
        String originalname,
        String filename,
        String location
) {
}
