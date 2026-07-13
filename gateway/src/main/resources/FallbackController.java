package com.trabalhoSD.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class FallbackController {

    @RequestMapping("/fallback/negocioService")
    public Mono<ResponseEntity<Map<String, String>>> negocioServiceFallback() {
        Map<String, String> response = Map.of("error", "Serviço de Negócio indisponível no momento.", "message", "Por favor, tente novamente mais tarde.");
        return Mono.just(ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response));
    }
}