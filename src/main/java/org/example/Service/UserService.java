package org.example.Service;


import org.example.Model.User;
import org.example.Repository.UserRepository;

public class UserService {

    private UserRepository repository =
            new UserRepository();

    public void addUser(User user) {
        repository.save(user);
        System.out.println("User Added Successfully");
    }
    public void showUsers() {
        for(User user :repository.findAll()) {
            System.out.println(user);
        }
    }
}
