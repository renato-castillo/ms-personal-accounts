package com.bootcamp.personalaccounts.service;

import com.bootcamp.personalaccounts.entity.PersonalAccount;
import com.bootcamp.personalaccounts.util.ICRUD;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonalAccountService {

    Mono<PersonalAccount> save(PersonalAccount v);

    Mono<Void> deleteById(String id);

    Mono<PersonalAccount> findById(String id);

    Flux<PersonalAccount> findAll();

    Mono<PersonalAccount> findByName(String name);

}
