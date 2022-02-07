package com.hfp.hfp_back.service;

import com.hfp.hfp_back.model.User;
import com.hfp.hfp_back.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Autowired
    public List<User> getAllUser() {
        return (List<User>) userRepo.findAll();
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteUserById(id);
    }

    public void addUser(UserService userService) {
    }
}
