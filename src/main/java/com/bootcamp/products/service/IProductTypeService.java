package com.bootcamp.products.service;

import com.bootcamp.products.entity.ProductType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductTypeService {

    Mono<ProductType> create(ProductType productType);
    Flux<ProductType> findAll();
    Mono<ProductType> findById(String id);
}
