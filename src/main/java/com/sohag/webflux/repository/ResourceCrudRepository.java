package com.sohag.webflux.repository;

import com.sohag.webflux.model.Resource;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ResourceCrudRepository extends ReactiveCrudRepository<Resource, String> {
}
