package io.github.emlagowski.personion.domain;

public class CreatePersonCommand {
    private final String firstName;
    private final String lastName;
    private final int age;

    public CreatePersonCommand(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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
}
