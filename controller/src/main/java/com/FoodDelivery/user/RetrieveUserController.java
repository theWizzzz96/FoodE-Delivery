package com.FoodDelivery.user;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
public class RetrieveUserController {
    private final SysUserService userService;
    private Integer userId;
    private String username;
    private String email;
    private String passwordHash;
    private String fullName;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public RetrieveUserController(SysUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsers() {
        Optional<SysUserDomain> user = userService.findUserById(1);
        user.ifPresent(e -> {
            userId = e.getUserId();
            username = e.getUsername();
            email = e.getEmail();
            passwordHash = e.getPasswordHash();
            fullName = e.getFullName();
            phoneNumber = e.getPhoneNumber();
            createdAt = e.getCreatedAt();
            updatedAt = e.getUpdatedAt();

        });

        return email + '\n' + username + '\n' + email + '\n' + passwordHash + '\n' + fullName + '\n' + phoneNumber
                + '\n' + createdAt + '\n' + updatedAt;
    }
}
