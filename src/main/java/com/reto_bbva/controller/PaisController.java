package com.reto_bbva.controller;
import com.reto_bbva.model.Country;
import com.reto_bbva.service.LogService;
import com.reto_bbva.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pais")
public class PaisController {
    private final PaisService paisService;
    private final LogService logService;

    @Autowired
    public PaisController(PaisService paisService, LogService logService) {
        this.paisService = paisService;
        this.logService = logService;
    }

    @GetMapping
    public ResponseEntity<Object> buscarPais(@RequestParam("nombre") String nombrePais) {
        Country country = paisService.buscarPais(nombrePais);
        if (country != null) {
            logService.guardarLog(nombrePais, country);
            return ResponseEntity.ok(country);
        } else {
            logService.guardarLog(nombrePais, null);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
