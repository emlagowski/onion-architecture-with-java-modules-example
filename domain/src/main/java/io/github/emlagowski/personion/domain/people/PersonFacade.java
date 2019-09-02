package io.github.emlagowski.personion.domain.people;

import reactor.core.publisher.Mono;

import java.util.UUID;

public class PersonFacade {

    private final PersonWriter personWriter;

    public PersonFacade(PersonWriter personWriter) {
        this.personWriter = personWriter;
    }

    public Mono<PersonId> createPerson(CreatePersonCommand createPersonCommand) {
        UUID uuid = UUID.randomUUID();
        Person person = new Person(uuid, createPersonCommand.getFirstName(), createPersonCommand.getLastName(), createPersonCommand.getAge());
        return personWriter.save(person).map(Person::getPersonId);
    }

}
