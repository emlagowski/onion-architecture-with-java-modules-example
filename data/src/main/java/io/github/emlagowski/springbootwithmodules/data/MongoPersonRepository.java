package io.github.emlagowski.springbootwithmodules.data;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MongoPersonRepository extends ReactiveMongoRepository<MongoPerson, UUID> {

}
