package br.com.mco.nasa.nasa.service;

public interface IServiceBase <E> {

    public E save(E entity);

    public E findById(Long id);


}
