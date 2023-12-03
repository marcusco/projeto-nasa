package br.com.mco.nasa.nasa.service;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.annotations.AnnotationInjector;
import br.com.mco.nasa.nasa.domain.Planeta;


@Service
public abstract class ServiceBase <T, E>  implements IServiceBase<E>{
    //
    T repository;
    E entity;

    public ServiceBase(T repository) {
        super();
        this.repository = repository;
    }

    public T getRepository(){
        return repository;
    }

    public E getEntity(){
        return entity;
    }

    @Override
    public void preSave(E entity){
        AnnotationInjector.inject(entity);
    }
}
