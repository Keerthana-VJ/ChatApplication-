package org.example.Model;

public class GroupMember {
    private int memberId;
    private User user;
    private Group group;
    private String joinedAt;
    public GroupMember(int memberId,User user,Group group,String joinedAt) {
        this.memberId = memberId;
        this.user = user;
        this.group = group;
        this.joinedAt = joinedAt;
    }

    @Override
    public String toString() {

        return "\nMember ID : " + memberId +
                "\nUser : " + user.getUsername() +
                "\nGroup : " + group.getGroupName() +
                "\nJoined At : " + joinedAt;
    }
}
