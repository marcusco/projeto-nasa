package br.com.mco.nasa.nasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mco.nasa.nasa.domain.Planeta;

public interface PlanetaRepository extends JpaRepository<Planeta, Long>{
    
}
