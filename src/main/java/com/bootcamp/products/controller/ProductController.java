package com.bootcamp.products.controller;

import com.bootcamp.products.entity.Product;
import com.bootcamp.products.entity.ProductType;
import com.bootcamp.products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    private Mono<Product> save() {

        /*
        ProductType productType = new ProductType();

        Product product = new Product();
        product.setLimit(new BigDecimal(1000));
        productType.setName("Producto Prueba");
        product.addProductType(productType);
         */

        return productService.create(new Product());
    }
}
