package org.example.Model;

public class Message {

    private int messageId;
    private User sender;
    private Group group;
    private String content;
    private Status status;
    public Message(int messageId,User sender,Group group,String content,Status status) {
        this.messageId = messageId;
        this.sender = sender;
        this.group = group;
        this.content = content;
        this.status = status;
    }

    @Override
    public String toString() {

        return "\nMessage ID : " + messageId +
                "\nSender : " + sender.getUsername() +
                "\nGroup : " + group.getGroupName() +
                "\nContent : " + content +
                "\nStatus : " + status;
    }
}
