package com.sohag.webflux.service;

import com.sohag.webflux.model.Resource;
import com.sohag.webflux.repository.ResourceRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ResourceFluxService {
    private final ResourceRepository repository;

    public ResourceFluxService(ResourceRepository repository) {
        this.repository = repository;
    }

    public Flux<Resource> findAll() {
        return repository.findAll();
    }

    public Flux<Resource> filter() {
        return repository.findAll(Example.of(new Resource(null, "sohag", null)));
    }

    public Mono<Resource> save(Resource resource) {
        return repository.save(resource);
    }


}
