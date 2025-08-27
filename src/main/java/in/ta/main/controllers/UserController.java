package in.ta.main.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ta.main.dto.CreateUserRequest;
import in.ta.main.models.*;
import in.ta.main.services.*;
import jakarta.validation.Valid;

import java.net.*;


@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody CreateUserRequest body) {
        User created = userService.add(body.getFirstName(), body.getLastName());
        return ResponseEntity.created(URI.create("/users/" + created.getId())).body(created);
    }
}
