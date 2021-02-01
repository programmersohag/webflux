package com.sohag.webflux.controller;

import com.sohag.webflux.model.Resource;
import com.sohag.webflux.repository.ResourceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    private final ResourceRepository resourceRepository;

    public ResourceController(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @GetMapping("/{id}")
    public Mono<Resource> getResource(@PathVariable String id) {
        return resourceRepository.findById(id);
    }

    @GetMapping("findAll")
    public Flux<Resource> getResources() {
        return resourceRepository.findAll();
    }

}
