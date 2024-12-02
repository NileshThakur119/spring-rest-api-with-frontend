package com.registration.registration.service;

import com.registration.registration.entity.User;
import com.registration.registration.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User addUser(User User) {

        return userRepo.save(User);
    }

    public List<User> listUser() {

        return userRepo.findAll();
    }


    public User fetchUserById(Long UserID) {

        return userRepo.findById(UserID).get();
    }

    public String deleteUser(Long UserID) {
        User e = userRepo.findById(UserID).get();
        userRepo.delete(e);
        return "User Record Deleted";
    }

    public User editUser(Long UserID, User User) {

        User e = userRepo.findById(UserID).get();
        if (Objects.nonNull(User.getUserFirstName()) && !"".equals(User.getUserFirstName())) {
            e.setUserFirstName(User.getUserFirstName());
        }
        if (Objects.nonNull(User.getUserLastName()) && !"".equals(User.getUserLastName())) {
            e.setUserLastName(User.getUserLastName());
        }
        if (Objects.nonNull(User.getUserEmail()) && !"".equals(User.getUserEmail())) {
            e.setUserEmail(User.getUserEmail());
        }
        if (Objects.nonNull(User.getUserPhone()) && !"".equals(User.getUserPhone())) {
            e.setUserPhone(User.getUserPhone());
        }
        if (Objects.nonNull(User.getUserLocation()) && !"".equals(User.getUserLocation())) {
            e.setUserLocation(User.getUserLocation());
        }
        return userRepo.save(e);
    }
}
