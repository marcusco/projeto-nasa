package br.com.mco.nasa.nasa.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mco.nasa.nasa.domain.Planeta;
import br.com.mco.nasa.nasa.service.PlanetaService;

@RestController("planeta/")
public class PlanetaController {

   private final PlanetaService planetaService;

    Double lat = 49.9585;
    Double lon = 19.8686;
    String apiKey = "R5xIC6GyyOcjB9WKs7PRmIf3io7hd34BTovAsxX1";

    public PlanetaController(PlanetaService planetaService){
        this.planetaService = planetaService;
    }

    @PostMapping
    public Planeta save(@RequestBody Planeta planeta){

        return planetaService.save(planeta);
        
    }


}
