package org.example.Repository;

import org.example.Model.MessageStatus;

import java.util.ArrayList;
import java.util.List;

public class MessageStatusRepository {
    private List<MessageStatus> statuses =new ArrayList<>();
    public void save(MessageStatus status) {
        statuses.add(status);
    }
    public List<MessageStatus> findAll() {
        return statuses;
    }
}
