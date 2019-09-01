package io.github.emlagowski.springbootwithmodules.data;

//import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

//public interface MongoPersonRepository extends ReactiveMongoRepository<MongoPerson, UUID> {
//
//}

@Component
public class MongoPersonRepository {

    public Flux<MongoPerson> findAll() {
        return Flux.just(
                new MongoPerson(),
                new MongoPerson(),
                new MongoPerson(),
                new MongoPerson()
        );
    }

    public Mono<MongoPerson> findById(UUID uuid) {
        return Mono.just(new MongoPerson());
    }
}
