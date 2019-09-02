package io.github.emlagowski.personion.data.people;

import io.github.emlagowski.personion.domain.people.Person;
import io.github.emlagowski.personion.domain.people.PersonReader;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Component
public class MongoPersonReader implements PersonReader {

    private final MongoPersonRepository mongoPersonRepository;
    private final MongoPersonMapper mongoPersonMapper;

    public MongoPersonReader(MongoPersonRepository mongoPersonRepository, MongoPersonMapper mongoPersonMapper) {
        this.mongoPersonRepository = mongoPersonRepository;
        this.mongoPersonMapper = mongoPersonMapper;
    }

    @Override
    public Flux<Person> findAll() {
        return mongoPersonRepository
                .findAll()
                .map(mongoPersonMapper::toPerson);
    }

    @Override
    public Mono<Person> findById(UUID uuid) {
        return mongoPersonRepository
                .findById(uuid)
                .map(mongoPersonMapper::toPerson);
    }

}
