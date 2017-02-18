package chat_Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Film on 18/2/2560.
 */

@RestController
public class startController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
