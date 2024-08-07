package be.infernalwhale.load_balancer_backend.controller;

import be.infernalwhale.load_balancer_backend.service.BackendServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config/backend")
public class BackendServerController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final BackendServerService service;

    public BackendServerController(BackendServerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity getBackendServerList() {
        return ResponseEntity.ok(service.getServers());
    }
}
