package br.com.mco.nasa.nasa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mco.nasa.nasa.domain.Tenant_Id;

@Repository
public interface TenantIdRepository extends JpaRepository<Tenant_Id, Long> {

}
