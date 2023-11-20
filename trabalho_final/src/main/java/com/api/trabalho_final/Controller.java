package com.api.trabalho_final;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    
@RestController
@RequestMapping("/ola")
public class Controller {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Olá mundo!");
    }
    
}

