package io.github.emlagowski.personion.data.people;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MongoPersonRepository extends ReactiveMongoRepository<MongoPerson, UUID> {

}
