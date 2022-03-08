package com.bootcamp.products.repository;

import com.bootcamp.products.entity.ProductType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductTypeRepository extends ReactiveMongoRepository<ProductType, String> {
}
