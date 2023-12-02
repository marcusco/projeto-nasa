package br.com.mco.nasa.nasa.repository;



import org.hibernate.annotations.TenantId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantIdRepository extends JpaRepository<TenantId, Long> {

}
