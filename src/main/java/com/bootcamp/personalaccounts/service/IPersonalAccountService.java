package com.bootcamp.personalaccounts.service;

import com.bootcamp.personalaccounts.entity.PersonalAccount;
import com.bootcamp.personalaccounts.util.ICRUD;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonalAccountService extends ICRUD<PersonalAccount, String> {

    Mono<PersonalAccount> findByName(String name);

}
