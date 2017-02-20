package chat_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@LineMessageHandler
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        DBManager dbManager = new DBManager();
        dbManager.start();
    }
}

class DBManager extends Thread {
//	public void run(){
//		System.setProperty("java.awt.headless", "false");
//		org.hsqldb.util.DatabaseManagerSwing.main(new String[] {
//				"--url",  "jdbc:mysql://localhost/fitupapp", "--noexit"
//
//		});
//	}

//    @EventMapping
//    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) throws Exception {
//        System.out.println("event: " + event);
//        return new TextMessage(event.getMessage().getText());
//    }
//
//    @EventMapping
//    public void handleDefaultMessageEvent(Event event) {
//        System.out.println("event: " + event);
//    }

}