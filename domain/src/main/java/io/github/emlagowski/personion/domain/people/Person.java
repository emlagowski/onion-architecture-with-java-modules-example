package io.github.emlagowski.personion.domain.people;

import java.util.UUID;

public class Person {
    private final UUID id;
    private String firstName;
    private final String lastName;
    private final int age;

    public Person(UUID id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    PersonId getPersonId() {
        return new PersonId(id);
    }

    Person changeName(String newName) {
        this.firstName = newName;
        return this;
    }
}
