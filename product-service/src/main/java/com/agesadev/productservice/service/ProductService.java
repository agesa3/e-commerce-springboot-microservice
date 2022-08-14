package com.agesadev.productservice.service;


import com.agesadev.productservice.dto.ProductRequest;
import com.agesadev.productservice.dto.ProductResponse;
import com.agesadev.productservice.model.Product;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
