package br.com.mco.nasa.nasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mco.nasa.nasa.domain.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Long>{
    
}
