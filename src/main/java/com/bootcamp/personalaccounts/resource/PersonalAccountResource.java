package com.bootcamp.personalaccounts.resource;

import com.bootcamp.personalaccounts.dto.PersonalAccountDto;
import com.bootcamp.personalaccounts.entity.PersonalAccount;
import com.bootcamp.personalaccounts.service.IPersonalAccountService;
import com.bootcamp.personalaccounts.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class PersonalAccountResource extends MapperUtil {

    @Autowired
    private IPersonalAccountService personalAccountService;

    public Mono<PersonalAccountDto> create(PersonalAccountDto personalAccountDto) {

        PersonalAccount personalAccount = convertToEntity(personalAccountDto);

        personalAccount.setCreatedAt(LocalDateTime.now());

        Mono<PersonalAccount> entity = personalAccountService.save(personalAccount);

        return entity.map(x -> convertToDto(x));
    }

    public Mono<PersonalAccountDto> update(PersonalAccountDto personalAccountDto) {

        Mono<PersonalAccount> personalAccountMono = personalAccountService.findById(personalAccountDto.getId());

        if(!personalAccountMono.equals(Mono.empty())) {
            PersonalAccount personalAccount = convertToEntity(personalAccountDto);
            personalAccount.setUpdatedAt(LocalDateTime.now());
            return personalAccountMono.map(x -> convertToDto(personalAccount));
        }

        return Mono.empty();
    }

    public Flux<PersonalAccountDto> findAll() {

        Flux<PersonalAccount> personalAccounts = personalAccountService.findAll();

        return personalAccounts.map(x -> convertToDto(x));
    }

    public Mono<PersonalAccountDto> findByName(String name) {

        Mono<PersonalAccount> personalAccount = personalAccountService.findByName(name);

        return personalAccount.map(x -> convertToDto(x));
    }
}
