package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private List<User> members = new ArrayList<>();
    public Group(int groupId,String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }
    public void addMember(User user) {
        members.add(user);
    }
    public String getGroupName() {
        return groupName;
    }
    public List<User> getMembers() {
        return members;
    }
}
