package io.github.emlagowski.personion.data.people;

import io.github.emlagowski.personion.domain.people.Person;
import io.github.emlagowski.personion.domain.people.PersonWriter;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MongoPersonWriter implements PersonWriter {

    private final MongoPersonRepository mongoPersonRepository;
    private final MongoPersonMapper mongoPersonMapper;

    public MongoPersonWriter(MongoPersonRepository mongoPersonRepository, MongoPersonMapper mongoPersonMapper) {
        this.mongoPersonRepository = mongoPersonRepository;
        this.mongoPersonMapper = mongoPersonMapper;
    }

    @Override
    public Mono<Person> save(Person person) {
        return mongoPersonRepository
                .save(mongoPersonMapper.fromPerson(person))
                .map(mongoPersonMapper::toPerson);
    }

}
