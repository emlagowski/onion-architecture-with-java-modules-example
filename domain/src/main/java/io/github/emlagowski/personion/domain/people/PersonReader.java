package io.github.emlagowski.personion.domain.people;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface PersonReader {
    Flux<Person> findAll();
    Mono<Person> findById(UUID uuid);
}
