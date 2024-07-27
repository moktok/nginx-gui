package be.obasi.java_web_tester;

import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/id")
public class SessionController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Value("${be.obasi.server_id}")
    private String serverID;
    
    @GetMapping({"", "/"})
    public String get(HttpSession httpSession, Model model) {
        logger.info("Received request with session: " + httpSession.getId());
        model.addAttribute("data", String.format("Hello World from session controller %s", serverID));
        model.addAttribute("id", httpSession.getId());
        
        return "data";
    }
}
