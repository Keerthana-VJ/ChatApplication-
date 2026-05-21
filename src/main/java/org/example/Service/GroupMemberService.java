package org.example.Service;
import org.example.Model.GroupMember;
import org.example.Repository.GroupMemberRepository;

public class GroupMemberService {
    private GroupMemberRepository repository =new GroupMemberRepository();
    public void addMember(GroupMember member) {
        repository.save(member);
        System.out.println("Member Added Successfully");
    }
    public void showMembers() {
        for(GroupMember member : repository.findAll()) {
            System.out.println(member);
        }
    }
}
