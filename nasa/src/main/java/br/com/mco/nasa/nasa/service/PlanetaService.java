package br.com.mco.nasa.nasa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.domain.Planeta;
import br.com.mco.nasa.nasa.repository.PlanetaRepository;

@Service
public class PlanetaService extends ServiceBase<PlanetaRepository, Planeta> {



    public PlanetaService(PlanetaRepository repository) {
        super(repository);
    }

    @Override
    public Planeta save(Planeta entity) {
        preSave(entity);
        return getRepository().save(entity);
    }

    @Override
    public Planeta findById(Long id) {
        return getRepository().findById(id).orElseThrow();
    }

    @Override
    public List<Planeta> findAll() {
       return getRepository().findAll();
    }

}
