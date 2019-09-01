package io.github.emlagowski.springbootwithmodules.api.rest;

import io.github.emlagowski.springbootwithmodules.domain.Person;
import io.github.emlagowski.springbootwithmodules.domain.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/person")
public class TestController {

    private final PersonService personService;

    public TestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping()
    public Flux<Person> getAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Person> getById(@PathVariable("id") UUID id) {
        return personService.findById(id);
    }
}
