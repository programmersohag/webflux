package com.sohag.webflux.repository;

import com.sohag.webflux.model.Resource;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ResourceRepository extends ReactiveMongoRepository<Resource, String> {

    Flux<Resource> findAllByName(String name);

    Mono<Resource> findFirstByType(Mono<String> type);
}
