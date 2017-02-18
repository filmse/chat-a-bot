package chat_Project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Film on 18/2/2560.
 */

@CrossOrigin
@RestController
@RequestMapping("/")
public class startController {

    @RequestMapping(value = "/", method = RequestMethod.PATCH)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
