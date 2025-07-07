package com.FoodDelivery.user.retrieve;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.service.SysUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RetrieveUserController {
    private final SysUserService userService;

    public RetrieveUserController(SysUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<SysUserDomain>> getUsers() throws Exception {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}
