package io.github.emlagowski.personion.domain.people;

import reactor.core.publisher.Mono;

import java.util.UUID;

public class PersonFacade {

    private final PersonWriter personWriter;
    private final PersonReader personReader;

    public PersonFacade(PersonWriter personWriter, PersonReader personReader) {
        this.personWriter = personWriter;
        this.personReader = personReader;
    }

    public Mono<PersonId> createPerson(CreatePersonCommand createPersonCommand) {
        UUID uuid = UUID.randomUUID();
        Person person = new Person(uuid, createPersonCommand.getFirstName(), createPersonCommand.getLastName(), createPersonCommand.getAge());
        return personWriter.save(person).map(Person::getPersonId);
    }

    public Mono<Person> changePersonName(ChangePersonNameCommand changePersonNameCommand) {
        return personReader.findById(changePersonNameCommand.getId())
                .map(p -> p.changeName(changePersonNameCommand.getNewName()))
                .flatMap(personWriter::save);
    }

}
