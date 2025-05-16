package dev.resume.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
@Entity(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Email(message = "Email is not valid")
    private String email;

    @Length(min = 6, message = "Password must be at least 6 characters")
    private String password;
}
