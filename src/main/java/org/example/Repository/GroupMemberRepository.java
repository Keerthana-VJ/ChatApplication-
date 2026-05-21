package org.example.Repository;
import org.example.Model.GroupMember;
import java.util.ArrayList;
import java.util.List;

public class GroupMemberRepository {
    private List<GroupMember> members =new ArrayList<>();
    public void save(GroupMember member) {
        members.add(member);
    }

    public List<GroupMember> findAll() {
        return members;
    }
}