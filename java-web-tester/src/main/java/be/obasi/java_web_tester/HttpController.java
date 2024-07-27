package be.obasi.java_web_tester;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HttpController {
    @Value("${be.obasi.server_id}")
    private String serverID;
    
    @GetMapping
    public ResponseEntity get() {
        return ResponseEntity.ok(String.format("Hello from %s", serverID));
    }
}
