package com.bootcamp.personalaccounts.service;

import com.bootcamp.personalaccounts.entity.PersonalAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonalAccountService {

    Mono<PersonalAccount> save(PersonalAccount personalAccount);

    Flux<PersonalAccount> findAll();

    Mono<PersonalAccount> findByName(String name);
}
