package com.spring.hour.customer.client.dto;

import java.time.LocalDateTime;

/**
 * {
 *     "id": 1,
 *     "name": "Clothes",
 *     "slug": "clothes",
 *     "image": "https://i.imgur.com/QkIa5tT.jpeg",
 *     "creationAt": "2025-06-22T15:19:21.000Z",
 *     "updatedAt": "2025-06-22T23:53:11.000Z"
 *   }
 */
public record CategoryResponse(
        Integer id,
        String name,
        String slug,
        String image,
        LocalDateTime creationAt,
        LocalDateTime updatedAt
) {
}
