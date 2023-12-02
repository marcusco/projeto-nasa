package br.com.mco.nasa.nasa.service;

import org.hibernate.annotations.TenantId;
import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.repository.TenantIdRepository;

@Service
public class TenantIdService extends ServiceBase<TenantIdRepository, TenantId>{

    public TenantIdService(TenantIdRepository repository, TenantId entity) {
        super(repository, entity);
    }

    @Override
    public TenantId save(TenantId entity) {
       return getRepository().save(entity);
    }

    @Override
    public TenantId findById(Long id) {
        return getRepository().findById(id).orElseThrow();
    }

   

   
    
}
