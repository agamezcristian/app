package com.test.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    @Autowired
    private FeingClient feingClient;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        log.info("execute service");
        return ResponseEntity.ok("Hello from microservice 1");
    }

    @GetMapping("/gretting")
    public ResponseEntity<String> gretting() {
        log.info("call microservices 2");
        return ResponseEntity.ok(feingClient.gretting());
    }
}
