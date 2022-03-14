package com.bootcamp.personalaccounts.repository;

import com.bootcamp.personalaccounts.entity.PersonalAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IPersonalAccountRepository extends ReactiveMongoRepository<PersonalAccount, String> {

    Mono<PersonalAccount> findByName(String name);
}
