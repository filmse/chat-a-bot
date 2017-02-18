package chat_Project.dao;

import chat_Project.entity.Message;
import chat_Project.repository.messageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Film on 19/2/2560.
 */

@Repository
public class messageDaoImpl implements messageDao {

    @Autowired
    messageRepository MessageRepository;

    @Override
    public Message addMessage(Message messages) {
        return MessageRepository.save(messages);
    }
}
