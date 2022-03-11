package com.bootcamp.personalaccounts.service;

import com.bootcamp.personalaccounts.entity.PersonalAccount;
import com.bootcamp.personalaccounts.repository.IPersonalAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonalAccountServiceImpl implements IPersonalAccountService {

    @Autowired
    private IPersonalAccountRepository personalAccountRepository;

    public Mono<PersonalAccount> save(PersonalAccount personalAccount) {
        return personalAccountRepository.save(personalAccount);
    }

    public Mono<Void> deleteById(String id) {
        return personalAccountRepository.deleteById(id);
    }

    public Flux<PersonalAccount> findAll() {
        return personalAccountRepository.findAll();
    }

    public Mono<PersonalAccount> findByName(String name) {
        return personalAccountRepository.findByName(name);
    }

    public Mono<PersonalAccount> findById(String id) {
        return personalAccountRepository.findById(id);
    }
}
