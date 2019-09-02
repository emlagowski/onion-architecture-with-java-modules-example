package io.github.emlagowski.personion.domain;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface PersonService {
    Flux<Person> findAll();
    Mono<Person> findById(UUID uuid);
    Mono<PersonId> save(CreatePersonCommand createPersonCommand);
}
