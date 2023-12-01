package br.com.mco.nasa.nasa.clients;

import java.util.Date;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://api.nasa.gov/planetary/earth/imagery", name = "earth")
public interface EarthClient {

    @GetMapping("/{lat}/{lon}/{date}/{api_key}")
    String getEarth(@PathVariable Double lat, @PathVariable Double lon , @PathVariable Date date, @PathVariable String apiKey);
  
}
