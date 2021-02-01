package com.sohag.webflux.service;

import com.sohag.webflux.model.Resource;
import com.sohag.webflux.repository.ResourceRxJavaRepository;
import io.reactivex.Flowable;
import org.springframework.stereotype.Service;

@Service
public class ResourceRxService {
    private final ResourceRxJavaRepository repository;

    public ResourceRxService(ResourceRxJavaRepository repository) {
        this.repository = repository;
    }
    public Flowable<Resource> getResource(){
        return repository.findAll();
    }
}
