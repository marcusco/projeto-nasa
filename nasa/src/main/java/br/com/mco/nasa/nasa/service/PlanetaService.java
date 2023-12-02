package br.com.mco.nasa.nasa.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.domain.Planeta;
import br.com.mco.nasa.nasa.repository.PlanetaRepositoty;



@Service
public class PlanetaService  extends ServiceBase<PlanetaRepositoty, Planeta>{



    public PlanetaService(PlanetaRepositoty repository, Planeta entity) {
        super(repository, entity);
    }

    @Override
    public Planeta save(Planeta entity) {
        return getRepository().save(entity);

    }

   

    
}
