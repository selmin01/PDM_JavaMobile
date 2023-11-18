package com.api.trabalho_final;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
    
    @RestController
    @RequestMapping("/ola")
    public class OlaMundoController {
        @GetMapping
        public ResponseEntity<String> get() {
            return ResponseEntity.ok("Olá mundo!");
        }
    }

}
