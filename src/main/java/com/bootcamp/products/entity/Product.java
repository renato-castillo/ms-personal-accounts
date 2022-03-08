package com.bootcamp.products.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class Product {

    @Id
    private String id;

    /*
    private String name;

    private BigDecimal monthlyLimit;
    private BigDecimal monthlyMaintenance;

    private ProductType productTypes;

    private LocalDate movementUniqueDate;
     */


}
