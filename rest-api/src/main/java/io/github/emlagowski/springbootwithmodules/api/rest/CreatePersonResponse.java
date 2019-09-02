package io.github.emlagowski.springbootwithmodules.api.rest;

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
