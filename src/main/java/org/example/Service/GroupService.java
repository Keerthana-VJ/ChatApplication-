package org.example.Service;

import org.example.Model.Group;
import org.example.Model.User;
import org.example.Repository.GroupRepository;

public class GroupService {

    private GroupRepository repository = new GroupRepository();
    public void createGroup(Group group) {
        repository.save(group);
        System.out.println("Group Created");
    }
    public void addMember(Group group, User user) {
        group.addMember(user);
        System.out.println(user.getUsername() + " added to group");
    }
}
