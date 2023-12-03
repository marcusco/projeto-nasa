package br.com.mco.nasa.nasa.service;

import org.springframework.stereotype.Service;


@Service
public abstract class ServiceBase <T>  {
    //
    T repository;

    public ServiceBase(T repository) {
        super();
        this.repository = repository;
    }

    public T getRepository(){
        return repository;
    }
}
