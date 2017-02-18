package chat_Project.repository;

import chat_Project.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Film on 18/2/2560.
 */
public interface messageRepository extends JpaRepository<Message, Long> {
}
