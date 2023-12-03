package br.com.mco.nasa.nasa.service;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.domain.Planeta;
import br.com.mco.nasa.nasa.repository.PlanetaRepository;

@Service
public class PlanetaService extends ServiceBase<PlanetaRepository> implements IServiceBase<Planeta>{



    public PlanetaService(PlanetaRepository repository) {
        super(repository);
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
