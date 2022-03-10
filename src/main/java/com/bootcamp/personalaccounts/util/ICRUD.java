package com.bootcamp.personalaccounts.util;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICRUD<T,V> {

    Mono<T> save(T v);

    Mono<Void> deleteById(V v);

    Mono<T> findById(V v);

    Flux<T> findAll();
}
