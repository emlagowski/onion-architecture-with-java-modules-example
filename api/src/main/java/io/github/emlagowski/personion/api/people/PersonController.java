package io.github.emlagowski.personion.api.people;

import io.github.emlagowski.personion.domain.people.CreatePersonCommand;
import io.github.emlagowski.personion.domain.people.Person;
import io.github.emlagowski.personion.domain.people.PersonFacade;
import io.github.emlagowski.personion.domain.people.PersonReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonReader personReader;
    private final PersonFacade personFacade;
    private final CreatePersonMapper createPersonMapper;

    public PersonController(PersonReader personReader, PersonFacade personFacade, CreatePersonMapper createPersonMapper) {
        this.personReader = personReader;
        this.personFacade = personFacade;
        this.createPersonMapper = createPersonMapper;
    }

    @GetMapping
    public Flux<Person> getAll() {
        return personReader.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Person> getById(@PathVariable("id") UUID id) {
        return personReader.findById(id);
    }

    @PostMapping
    public Mono<CreatePersonResponse> postPerson(@RequestBody CreatePersonRequest createPersonRequest) {
        return personFacade
                .createPerson(createPersonMapper.fromRequest(createPersonRequest))
                .map(createPersonMapper::toResponse);
    }
}
