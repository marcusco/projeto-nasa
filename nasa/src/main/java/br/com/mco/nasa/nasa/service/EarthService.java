package br.com.mco.nasa.nasa.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.mco.nasa.nasa.clients.EarthClient;

@Service
public class EarthService {

    private EarthClient earthClient;
    
    public EarthService(EarthClient earthClient){
        this.earthClient = earthClient;
    }

    public String getEarth(Double lat, Double lon, Date data, String apiKey){
        return earthClient.getEarth(lat, lon, data, apiKey);
    }
    
}
