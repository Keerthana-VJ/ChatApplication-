package org.example.Service;

import org.example.Model.Message;
import org.example.Repository.MessageRepository;

public class MessageService {

    private MessageRepository repository = new MessageRepository();
    public void sendMessage(Message message) {
        repository.save(message);
        System.out.println("Message Sent");
    }

    public void showMessages() {
        for(Message message :repository.findAll()) {
            System.out.println(message);
            System.out.println("-------------------");
        }
    }
}