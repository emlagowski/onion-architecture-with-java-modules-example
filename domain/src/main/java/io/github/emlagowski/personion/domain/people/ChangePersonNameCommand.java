package io.github.emlagowski.personion.domain.people;

import java.util.UUID;

public class ChangePersonNameCommand {
    private final UUID id;
    private final String newName;

    public ChangePersonNameCommand(UUID id, String newName) {
        this.id = id;
        this.newName = newName;
    }

    public UUID getId() {
        return id;
    }

    public String getNewName() {
        return newName;
    }
}
