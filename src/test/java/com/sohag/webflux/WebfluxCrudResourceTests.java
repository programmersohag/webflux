package com.sohag.webflux;

import com.sohag.webflux.model.Resource;
import com.sohag.webflux.repository.ResourceCrudRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebfluxCrudResourceTests {

    @Autowired
    private ResourceCrudRepository resourceCrudRepository;

    @Test
    void save() {
        Mono<Resource> re = resourceCrudRepository.save(new Resource(null, "sohag", "hello"));
        System.out.println(re.block());
    }

    @Test
    void findOne() {
        Mono<String> string = Mono.just("6017989c654163022f6a3f4e");
        Mono<Resource> re = resourceCrudRepository.findById(string);
        System.out.println(re.block());
    }

}
