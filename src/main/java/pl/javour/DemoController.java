package pl.javour;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${message:Test message}")
    private String message;
    
    @RequestMapping("/test")
    String test() {
        return message;
    }
}
