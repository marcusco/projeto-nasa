package br.com.mco.nasa.nasa.service;

public interface IServiceBase <T, E> {

    public E save(E entity);

    public E findById(Long id);
}
