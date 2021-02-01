package com.sohag.webflux;

import com.sohag.webflux.model.Resource;
import com.sohag.webflux.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebfluxApplicationTests {

    @Autowired
    private ResourceRepository resourceRepository;

    @Test
    void save() {
        Mono<Resource> re = resourceRepository.save(new Resource(null, "hire", "hr"));
        System.out.println(re.block());
    }

    @Test
    void findOne() {
        Mono<String> string = Mono.just("hr");
        Mono<Resource> re = resourceRepository.findFirstByType(string);
        System.out.println(re.block());
    }

}
