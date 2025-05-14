package dev.resume.backend.modules.user.controller;

import dev.resume.backend.modules.user.UserEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping()
    public void create(@Valid @RequestBody UserEntity userEntity){
        System.out.println(userEntity);
    }
}