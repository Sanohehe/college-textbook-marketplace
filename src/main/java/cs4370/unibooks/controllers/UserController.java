package cs4370.unibooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cs4370.unibooks.models.User;
import cs4370.unibooks.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
