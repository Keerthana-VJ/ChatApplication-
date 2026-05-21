package org.example.Model;

public class MessageStatus {
    private int statusId;
    private Message message;
    private User receiver;
    private Status status;
    public MessageStatus(int statusId,Message message,User receiver,Status status) {
        this.statusId = statusId;
        this.message = message;
        this.receiver = receiver;
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nStatus ID : " + statusId +
                "\nReceiver : " + receiver.getUsername() +
                "\nStatus : " + status;
    }
}