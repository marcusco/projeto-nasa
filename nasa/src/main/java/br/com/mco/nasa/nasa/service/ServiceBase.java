package br.com.mco.nasa.nasa.service;

import org.springframework.stereotype.Service;


@Service
public abstract class ServiceBase <T, E> implements IServiceBase<T, E> {
    //
    T repository;
    E entity;

    public ServiceBase(T repository, E entity){
        super();
        this.repository = repository;
        this.entity = entity;
    }

    protected T getRepository(){
        return repository;
    }

    protected E getEntity(){
        return entity;
    }
}
