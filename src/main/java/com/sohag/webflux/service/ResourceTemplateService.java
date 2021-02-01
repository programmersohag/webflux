package com.sohag.webflux.service;

import com.sohag.webflux.model.Resource;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ResourceTemplateService {

    private final ReactiveMongoTemplate template;

    public ResourceTemplateService(ReactiveMongoTemplate template) {
        this.template = template;
    }

    public Mono<Resource> findById(String id) {
        return template.findById(id, Resource.class);
    }

    public Flux<Resource> findAll() {
        return template.findAll(Resource.class);
    }

    public Mono<Resource> save(Mono<Resource> account) {
        return template.save(account);
    }
}
