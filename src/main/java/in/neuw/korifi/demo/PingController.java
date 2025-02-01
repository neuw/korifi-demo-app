package in.neuw.korifi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class PingController {

    @GetMapping("/ping")
    public Pong ping() {
        return new Pong("Ponged at " + LocalDateTime.now());
    }

}
