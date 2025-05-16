package dev.resume.backend.controllers;

import dev.resume.backend.entities.UserEntity;
import dev.resume.backend.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity create(@Valid @RequestBody UserEntity userEntity){
        try {
            var result = userService.create(userEntity);
            return ResponseEntity.created(null).body(result);
        } catch(Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}