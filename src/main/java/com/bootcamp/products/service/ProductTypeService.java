package com.bootcamp.products.service;

import com.bootcamp.products.entity.ProductType;
import com.bootcamp.products.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public Mono<ProductType> create(ProductType productType) {
        return this.productTypeRepository.save(productType);
    }

    @Override
    public Flux<ProductType> findAll() {
        return this.productTypeRepository.findAll();
    }

    @Override
    public Mono<ProductType> findById(String id) {
        return this.productTypeRepository.findById(id);
    }
}
