package io.github.emlagowski.personion.api.people;

import java.util.UUID;

public class CreatePersonResponse {
    private final UUID id;

    public CreatePersonResponse(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
