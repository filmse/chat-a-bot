package chat_Project.controller;

import chat_Project.entity.Message;
import chat_Project.service.messageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/")
/**
 * Created by Film on 18/2/2560.
 */
public class messageController {

    @Autowired
    messageService MessageService;

    @RequestMapping(value = "addMessage", method = RequestMethod.POST)
    public Message addMessage(@RequestBody Message messages, BindingResult bindingResult) {
        return MessageService.addMessage(messages);
    }

}
