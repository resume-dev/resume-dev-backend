package dev.resume.backend.modules.user;

import jakarta.validation.constraints.Email;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class UserEntity {
    private UUID id;
    private String name;
    @Length(min = 6, message = "Password must be at least 6 characters")
    private String password;
    @Email(message = "Email is not valid")
    private String email;
}
