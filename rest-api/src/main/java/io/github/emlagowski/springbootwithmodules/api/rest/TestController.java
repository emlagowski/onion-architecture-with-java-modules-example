package io.github.emlagowski.springbootwithmodules.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
    @GetMapping("/test")
    public Mono<String> getInfo() {
        return Mono.just("ABC");
    }
}
