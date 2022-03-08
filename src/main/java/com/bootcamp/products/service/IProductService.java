package com.bootcamp.products.service;

import com.bootcamp.products.entity.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {

    Mono<Product> create(Product product);
    Flux<Product> findAll();
    Mono<Product> findById(String id);
}
