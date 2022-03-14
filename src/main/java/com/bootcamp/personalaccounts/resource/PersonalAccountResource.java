package com.bootcamp.personalaccounts.resource;

import com.bootcamp.personalaccounts.dto.PersonalAccountDto;
import com.bootcamp.personalaccounts.entity.PersonalAccount;
import com.bootcamp.personalaccounts.service.IPersonalAccountService;
import com.bootcamp.personalaccounts.util.MapperUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Slf4j
@Service
public class PersonalAccountResource extends MapperUtil {

    @Autowired
    private IPersonalAccountService personalAccountService;

    public Mono<PersonalAccountDto> create(PersonalAccountDto personalAccountDto) {

        log.debug("Create method beggining...");

        PersonalAccount personalAccount = map(personalAccountDto, PersonalAccount.class);

        personalAccount.setCreatedAt(LocalDateTime.now());

        return personalAccountService.save(personalAccount)
                .map(x -> map(x, PersonalAccountDto.class));
    }

    public Mono<PersonalAccountDto> update(PersonalAccountDto personalAccountDto) {

        return personalAccountService.findById(personalAccountDto.getId())
                .switchIfEmpty(Mono.error(new Exception()))
                .flatMap(y -> {
                    PersonalAccount personalAccount = map(personalAccountDto, PersonalAccount.class);
                    personalAccount.setCreatedAt(y.getCreatedAt());
                    personalAccount.setUpdatedAt(LocalDateTime.now());

                    return personalAccountService.save(personalAccount).map(x -> map(x, PersonalAccountDto.class));
                });
    }

    public Mono<Void> delete(PersonalAccountDto personalAccountDto) {

        return personalAccountService.findById(personalAccountDto.getId())
                .switchIfEmpty(Mono.error(new Exception()))
                .flatMap(x -> personalAccountService.deleteById(personalAccountDto.getId()));
    }

    public Flux<PersonalAccountDto> findAll() {

        return personalAccountService.findAll()
                .map(x -> map(x, PersonalAccountDto.class));
    }

    public Mono<PersonalAccountDto> findById(String id) {
        return personalAccountService.findById(id).map(x -> map(x, PersonalAccountDto.class));
    }

    public Mono<PersonalAccountDto> findByName(String name) {

        return personalAccountService.findByName(name)
                .map(x -> map(x, PersonalAccountDto.class));
    }
}
