package com.sohag.webflux.repository;

import com.sohag.webflux.model.Resource;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;

public interface ResourceRxJavaRepository extends RxJava2CrudRepository<Resource, String> {

    Observable<Resource> findAllByName(String name);

    Single<Resource> findFirstByType(Single<String> type);
}
