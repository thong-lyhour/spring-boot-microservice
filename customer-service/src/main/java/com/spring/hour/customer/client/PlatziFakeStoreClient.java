package com.spring.hour.customer.client;

import com.spring.hour.customer.client.dto.CategoryResponse;
import com.spring.hour.customer.client.dto.CreateProductRequest;
import com.spring.hour.customer.client.dto.FileUploadResponse;
import com.spring.hour.customer.client.dto.ProductResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@HttpExchange
public interface PlatziFakeStoreClient {

    @PostExchange("/files/upload")
    FileUploadResponse uploadFile(@RequestPart MultipartFile file);

    @PostExchange("/products")
    ProductResponse createProduct(@RequestBody CreateProductRequest createProductRequest);

    @GetExchange("/products")
    List<ProductResponse> getProducts(@RequestParam Integer offset,
                                      @RequestParam Integer limit);

    @GetExchange("/products/{id}")
    ProductResponse getProductById(@PathVariable Integer id);

    @GetExchange("/categories")
    List<CategoryResponse> getCategories();

}
