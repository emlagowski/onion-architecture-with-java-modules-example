package io.github.emlagowski.springbootwithmodules.data;

import io.github.emlagowski.springbootwithmodules.domain.CreatePersonCommand;
import io.github.emlagowski.springbootwithmodules.domain.Person;
import io.github.emlagowski.springbootwithmodules.domain.PersonId;
import io.github.emlagowski.springbootwithmodules.domain.PersonService;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Component
public class MongoPersonService implements PersonService {

    private final MongoPersonRepository mongoPersonRepository;

    public MongoPersonService(MongoPersonRepository mongoPersonRepository) {
        this.mongoPersonRepository = mongoPersonRepository;
    }

    @Override
    public Flux<Person> findAll() {
        return mongoPersonRepository.findAll().map(this::map);
    }

    @Override
    public Mono<Person> findById(UUID uuid) {
        return mongoPersonRepository.findById(uuid).map(this::map);
    }

    @Override
    public Mono<PersonId> save(CreatePersonCommand createPersonCommand) {
        return mongoPersonRepository.save(map(createPersonCommand)).map(m -> new PersonId(m.id));
    }

    private Person map(MongoPerson mongoPerson) {
        return new Person(mongoPerson.id, mongoPerson.firstName, mongoPerson.lastName, mongoPerson.age);
    }

    private MongoPerson map(CreatePersonCommand createPersonCommand) {
        MongoPerson mongoPerson = new MongoPerson();
        mongoPerson.age = createPersonCommand.getAge();
        mongoPerson.firstName = createPersonCommand.getFirstName();
        mongoPerson.lastName = createPersonCommand.getLastName();
        mongoPerson.id = UUID.randomUUID();
        return mongoPerson;
    }
}
