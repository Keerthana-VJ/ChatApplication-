package org.example.Repository;

import org.example.Model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups =new ArrayList<>();
    public void save(Group group) {
        groups.add(group);
    }
    public List<Group> findAll() {
        return groups;
    }
}
