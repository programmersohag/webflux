package com.sohag.webflux.client;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class EmployeeWebClient {

    WebClient client = WebClient.create("http://localhost:8181");

    public Mono<String> findName() {

//        nameMono.subscribe(System.out::println);
        return client.get()
                .uri("/employees/{id}", "1")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Flux<String> findAllName() {
        return client.get()
                .uri("/employees")
                .retrieve()
                .bodyToFlux(String.class);
    }

}
