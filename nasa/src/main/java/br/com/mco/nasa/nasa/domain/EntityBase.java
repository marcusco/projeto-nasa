package br.com.mco.nasa.nasa.domain;

import br.com.mco.nasa.nasa.annotations.AnnotationInjector;
import br.com.mco.nasa.nasa.annotations.Tenacidade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EntityBase {
    
    @Tenacidade(value = 1)
    Long tenant_id;

    protected  void inject(){
        AnnotationInjector.inject(this);
    }
}
