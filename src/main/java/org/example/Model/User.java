package org.example.Model;

public class User {
    private int userId;
    private String username;
    private String phoneNo;
    public User(int userId, String username, String phoneNo) {
        this.userId = userId;
        this.username = username;
        this.phoneNo = phoneNo;
    }
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public String toString() {
        return userId + " " + username;
    }
}
