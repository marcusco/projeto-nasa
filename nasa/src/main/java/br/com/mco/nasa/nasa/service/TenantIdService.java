package br.com.mco.nasa.nasa.service;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.domain.Tenant_Id;
import br.com.mco.nasa.nasa.repository.TenantIdRepository;

@Service
public class TenantIdService extends ServiceBase<TenantIdRepository, Tenant_Id>{

    public TenantIdService(TenantIdRepository repository, Tenant_Id entity) {
        super(repository, entity);
    }

    @Override
    public Tenant_Id save(Tenant_Id entity) {
       return getRepository().save(entity);
    }

    @Override
    public Tenant_Id findById(Long id) {
        return getRepository().findById(id).orElseThrow();
    }

   

   
    
}
