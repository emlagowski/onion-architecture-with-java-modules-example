package io.github.emlagowski.springbootwithmodules.api.rest;

public class CreatePersonRequest {
    private final String firstName;
    private final String lastName;
    private final int age;

    public CreatePersonRequest(String firstName, String lastName, int age) {
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
