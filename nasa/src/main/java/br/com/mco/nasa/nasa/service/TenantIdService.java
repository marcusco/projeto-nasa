package br.com.mco.nasa.nasa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.domain.Tenant_Id;
import br.com.mco.nasa.nasa.repository.TenantIdRepository;

@Service
public class TenantIdService extends ServiceBase<TenantIdRepository, Tenant_Id>{

    public TenantIdService(TenantIdRepository repository) {
        super(repository);
    }

    @Override
    public Tenant_Id save(Tenant_Id entity) {
        preSave(entity);
       return getRepository().save(entity);
    }

    @Override
    public Tenant_Id findById(Long id) {
        return getRepository().findById(id).orElseThrow();
    }

    @Override
    public List<Tenant_Id> findAll() {
       return getRepository().findAll();
    }

    @Override
    public void preSave(Tenant_Id entity) {
       
    }
    
}
