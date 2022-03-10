package com.bootcamp.personalaccounts.controller;

import com.bootcamp.personalaccounts.dto.PersonalAccountDto;
import com.bootcamp.personalaccounts.entity.PersonalAccount;
import com.bootcamp.personalaccounts.resource.PersonalAccountResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/personalaccounts")
public class PersonalAccountController {

    @Autowired
    private PersonalAccountResource personalAccountResource;

    @PostMapping
    public Mono<PersonalAccountDto> create(@RequestBody PersonalAccountDto personalAccountDto) {
        return personalAccountResource.create(personalAccountDto);
    }

    @PutMapping
    public Mono<PersonalAccountDto> update(@RequestBody PersonalAccountDto personalAccountDto) {
        return personalAccountResource.update(personalAccountDto);
    }

    @DeleteMapping
    public Mono<Void> delete(@RequestBody PersonalAccountDto personalAccountDto) {
        return personalAccountResource.delete(personalAccountDto);
    }

    @GetMapping
    public Flux<PersonalAccountDto> findAll() {
        return personalAccountResource.findAll();
    }

    @GetMapping("/find/name/{name}")
    public Mono<PersonalAccountDto> findByName(@PathVariable String name) {
        return personalAccountResource.findByName(name);
    }

}
