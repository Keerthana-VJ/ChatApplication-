

import org.example.Model.*;
import org.example.Service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        GroupService groupService = new GroupService();
        GroupMemberService groupMemberService = new GroupMemberService();
        MessageService messageService = new MessageService();
        MessageStatusService messageStatusService = new MessageStatusService();

        while (true) {

            System.out.println("\nCHAT SYSTEM");

            System.out.println("1. Add User");
            System.out.println("2. Create Group");
            System.out.println("3. Add Group Member");
            System.out.println("4. Send Message");
            System.out.println("5. Update Message Status");
            System.out.println("6. Show Users");
            System.out.println("7. Show Group Members");
            System.out.println("8. Show Messages");
            System.out.println("9. Show Message Status");
            System.out.println("10. Exit");

            System.out.print("\nEnter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Enter User ID : ");
                    int userId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Username : ");
                    String username = sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String phone = sc.nextLine();

                    User user = new User(userId,username,phone);
                    userService.addUser(user);
                    break;
                case 2:
                    System.out.print("Enter Group ID : ");
                    int groupId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Group Name : ");
                    String groupName = sc.nextLine();
                    Group group =new Group(groupId,groupName);
                    groupService.createGroup(group);
                    break;
                case 3:

                    System.out.print("Enter Member ID : ");
                    int memberId = sc.nextInt();
                    System.out.print("Enter User ID : ");
                    int uid = sc.nextInt();
                    System.out.print("Enter Group ID : ");
                    int gid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Joined Time : ");
                    String joinedAt = sc.nextLine();
                    User tempUser =new User(uid,"TemporaryUser","0000000000");
                    Group tempGroup =new Group(gid,"TemporaryGroup");
                    GroupMember member =new GroupMember(memberId,tempUser,tempGroup,joinedAt);
                    groupMemberService.addMember(member);
                    break;
                case 4:
                    System.out.print("Enter Message ID : ");
                    int messageId = sc.nextInt();
                    System.out.print("Enter Sender User ID : ");
                    int senderId = sc.nextInt();
                    System.out.print("Enter Group ID : ");
                    int msgGroupId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Message Content : ");
                    String content = sc.nextLine();
                    User sender =new User(senderId,"Sender","9999999999");
                    Group msgGroup =new Group(msgGroupId,"Java Team");
                    Message message =new Message(messageId,sender,msgGroup,content,Status.SENT);
                    messageService.sendMessage(message);
                    break;
                case 5:
                    System.out.print("Enter Status ID : ");
                    int statusId = sc.nextInt();
                    System.out.print("Enter Receiver User ID : ");
                    int receiverId = sc.nextInt();
                    System.out.print("Enter Message ID : ");
                    int msgId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Select Status");
                    System.out.println("1. SENT");
                    System.out.println("2. DELIVERED");
                    System.out.println("3. READ");
                    int statusChoice = sc.nextInt();
                    Status status = null;
                    switch (statusChoice) {
                        case 1:
                            status = Status.SENT;
                            break;
                        case 2:
                            status = Status.DELIVERED;
                            break;
                        case 3:
                            status = Status.READ;
                            break;
                        default:
                            System.out.println("Invalid Status");
                    }
                    User receiver =new User(receiverId,"Receiver","8888888888");

                    Message tempMessage =new Message(msgId,receiver,new Group(1, "Temp"),"Temp Message", Status.SENT);
                    MessageStatus messageStatus =new MessageStatus(statusId,tempMessage,receiver,status);
                    messageStatusService.updateStatus(messageStatus);
                    break;
                case 6:
                    userService.showUsers();
                    break;
                case 7:
                    groupMemberService.showMembers();
                    break;
                case 8:
                    messageService.showMessages();
                    break;
                case 9:
                    messageStatusService.showStatuses();
                    break;
                case 10:
                    System.out.println("Application Closed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}