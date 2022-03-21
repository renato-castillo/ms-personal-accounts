package com.bootcamp.personalaccounts.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class PersonalAccount extends BaseEntity {

    @Indexed(unique = true)
    private String name;

    private Float maintenanceCommission;

    private Integer maxMonthlyMovements;

    private Integer uniqueMovementDay;

    private Integer maxPerClient;

    private Float minOpenBalance;

    private Integer limitWithoutCommission;

    private Float commissionTransaction;
}
