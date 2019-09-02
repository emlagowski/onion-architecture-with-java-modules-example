package io.github.emlagowski.personion.data.people;

import io.github.emlagowski.personion.domain.people.Person;
import org.springframework.stereotype.Component;

@Component
class MongoPersonMapper {

    MongoPerson fromPerson(Person person) {
        MongoPerson mongoPerson = new MongoPerson();
        mongoPerson.age = person.getAge();
        mongoPerson.firstName = person.getFirstName();
        mongoPerson.lastName = person.getLastName();
        mongoPerson.id = person.getId();
        return mongoPerson;
    }

    Person toPerson(MongoPerson mongoPerson) {
        return new Person(mongoPerson.id, mongoPerson.firstName, mongoPerson.lastName, mongoPerson.age);
    }

}
