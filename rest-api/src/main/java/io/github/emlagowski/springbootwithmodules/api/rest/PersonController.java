package io.github.emlagowski.springbootwithmodules.api.rest;

import io.github.emlagowski.springbootwithmodules.domain.CreatePersonCommand;
import io.github.emlagowski.springbootwithmodules.domain.Person;
import io.github.emlagowski.springbootwithmodules.domain.PersonService;
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

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Flux<Person> getAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Person> getById(@PathVariable("id") UUID id) {
        return personService.findById(id);
    }

    @PostMapping
    public Mono<CreatePersonResponse> postPerson(@RequestBody CreatePersonRequest createPersonRequest) {
        return personService.save(map(createPersonRequest)).map(m -> new CreatePersonResponse(m.getId()));
    }

    private CreatePersonCommand map(CreatePersonRequest createPersonRequest) {
        return new CreatePersonCommand(createPersonRequest.getFirstName(), createPersonRequest.getLastName(), createPersonRequest.getAge());
    }
}
