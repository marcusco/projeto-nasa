package br.com.mco.nasa.nasa.service;

import java.util.List;

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

   

   
    
}
