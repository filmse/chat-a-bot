package chat_Project.service;

import chat_Project.dao.messageDao;
import chat_Project.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Film on 18/2/2560.
 */

@Service
public class messageServiceImpl implements messageService {

    @Autowired
    messageDao MessageDao;

    @Override
    public Message addMessage(Message messages) {
        return MessageDao.addMessage(messages);
    }
}
