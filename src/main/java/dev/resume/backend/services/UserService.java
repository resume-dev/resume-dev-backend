package dev.resume.backend.services;

import dev.resume.backend.entities.UserEntity;
import dev.resume.backend.exceptions.UserAlreadyExistException;
import dev.resume.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity create(UserEntity userEntity){
        var user = this.userRepository.findByEmail((userEntity.getEmail()));

        if(user != null){
            throw new UserAlreadyExistException();
        }

        return userRepository.save(userEntity);
    }
}