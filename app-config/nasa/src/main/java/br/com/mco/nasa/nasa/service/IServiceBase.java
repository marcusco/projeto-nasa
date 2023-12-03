package br.com.mco.nasa.nasa.service;

import java.util.List;

public interface IServiceBase <E> {

    public E save(E entity);

    public E findById(Long id);

    public List<E> findAll();


}
