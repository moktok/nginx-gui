package be.infernalwhale.load_balancer_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/command")
public class CommandController {
    @GetMapping
    public ResponseEntity getPong() {
        return ResponseEntity.ok("pong");
    }
}
