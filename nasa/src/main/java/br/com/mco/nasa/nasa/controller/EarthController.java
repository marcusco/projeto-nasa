package br.com.mco.nasa.nasa.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mco.nasa.nasa.service.EarthService;

@RestController("/earth")
public class EarthController {

    private final EarthService earthService;

    Double lat = 49.9585;
    Double lon = 19.8686;
    String apiKey = "R5xIC6GyyOcjB9WKs7PRmIf3io7hd34BTovAsxX1";

    EarthController(EarthService earthService){
        this.earthService = earthService;
    }


    @GetMapping()
    public void getEarth() {
        earthService.getEarth(lat, lon, new Date(), apiKey);
    }

}
