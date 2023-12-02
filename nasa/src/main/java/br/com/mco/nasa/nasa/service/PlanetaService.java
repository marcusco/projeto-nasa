package br.com.mco.nasa.nasa.service;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.domain.Planeta;
import br.com.mco.nasa.nasa.repository.PlanetaRepository;



@Service
public class PlanetaService  extends ServiceBase<PlanetaRepository, Planeta>{

    public PlanetaService(PlanetaRepository repository, Planeta entity) {
        super(repository, entity);
    }

    @Override
    public Planeta save(Planeta entity) {
        return getRepository().save(entity);

    }

    @Override
    public Planeta findById(Long id) {
        return getRepository().findById(id).orElseThrow();
    }

   

    
}
