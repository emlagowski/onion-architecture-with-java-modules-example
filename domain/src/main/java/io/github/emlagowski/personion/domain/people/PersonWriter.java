package io.github.emlagowski.personion.domain.people;

import reactor.core.publisher.Mono;

public interface PersonWriter {
    Mono<Person> save(Person person);
}
