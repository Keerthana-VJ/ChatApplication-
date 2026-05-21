package org.example.Service;

import org.example.Model.MessageStatus;
import org.example.Repository.MessageStatusRepository;

public class MessageStatusService {
    private MessageStatusRepository repository = new MessageStatusRepository();
    public void updateStatus(MessageStatus status) {
        repository.save(status);
        System.out.println("Message Status Updated");
    }
    public void showStatuses() {
        for(MessageStatus status :repository.findAll()) {
            System.out.println(status);
        }
    }
}
