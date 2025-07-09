package com.FoodDelivery.user.update;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.entities.SysUserEntity;
import com.FoodDelivery.service.SysUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveAndUpdateUser {
    private final SysUserService service;

    public SaveAndUpdateUser(SysUserService service) {
        this.service = service;
    }

    @PostMapping("save/user")
    public ResponseEntity<SysUserEntity> saveSysUserService(@RequestBody SysUserDomain user) {
        SysUserEntity obj = service.createUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }
}
