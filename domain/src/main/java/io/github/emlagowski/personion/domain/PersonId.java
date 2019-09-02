package io.github.emlagowski.personion.domain;

import java.util.UUID;

public class PersonId {
    private final UUID id;

    public PersonId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
