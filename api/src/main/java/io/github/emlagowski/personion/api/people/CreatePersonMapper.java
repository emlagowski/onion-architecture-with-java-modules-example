package io.github.emlagowski.personion.api.people;

import io.github.emlagowski.personion.domain.people.CreatePersonCommand;
import io.github.emlagowski.personion.domain.people.PersonId;
import org.springframework.stereotype.Component;

@Component
class CreatePersonMapper {

    CreatePersonCommand fromRequest(CreatePersonRequest request) {
        return new CreatePersonCommand(request.getFirstName(), request.getLastName(), request.getAge());
    }

    CreatePersonResponse toResponse(PersonId personId) {
        return new CreatePersonResponse(personId.getId());
    }

}
