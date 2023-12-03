package br.com.mco.nasa.nasa.domain;

import br.com.mco.nasa.nasa.annotations.Tenacidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "planeta", schema = "nasa")
public class Planeta extends EntityBase {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Tenacidade(value = 0)
    private Long tenant_Id;
    private String nome;
    
}
