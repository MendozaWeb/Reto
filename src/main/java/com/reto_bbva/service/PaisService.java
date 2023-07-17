package com.reto_bbva.service;
import com.reto_bbva.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class PaisService {
    private final RestTemplate restTemplate;

    @Autowired
    public PaisService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Country buscarPais(String nombrePais) {
        String apiUrl = "https://restcountries.com/v3.1/name/" + nombrePais;
        ResponseEntity<Country[]> response = restTemplate.getForEntity(apiUrl, Country[].class);

        if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null && response.getBody().length > 0) {
            return response.getBody()[0];
        } else {
            return null;
        }
    }
}
