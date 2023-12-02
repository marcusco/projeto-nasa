package br.com.mco.nasa.nasa.controller;


import org.springframework.web.bind.annotation.RestController;

import br.com.mco.nasa.nasa.service.PlanetaService;

@RestController("/planeta")
public class PlanetaController {

   private PlanetaService planetaService;

    Double lat = 49.9585;
    Double lon = 19.8686;
    String apiKey = "R5xIC6GyyOcjB9WKs7PRmIf3io7hd34BTovAsxX1";

    PlanetaController(PlanetaService planetaService){
        this.planetaService = planetaService;
    }


}
