package com.FoodDelivery.mapper;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.entities.SysUserEntity;

public class SysUserMapper {
    public static SysUserDomain toUserDomain(SysUserEntity user) {
        if (user == null) return null;

        return new SysUserDomain(
                user.getUserId(),
                user.getUsername(),
                user.getEmail(),
                user.getPasswordHash(),
                user.getFullName(),
                user.getPhoneNumber(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }
}
