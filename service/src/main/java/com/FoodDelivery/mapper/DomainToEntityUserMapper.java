package com.FoodDelivery.mapper;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.entities.SysUserEntity;

public class DomainToEntityUserMapper {
    public static SysUserEntity toEntityMapper(SysUserDomain user) {
        if (user == null) return null;

        SysUserEntity entity = new SysUserEntity();
        entity.setUsername(user.getUsername());
        entity.setEmail(user.getEmail());
        entity.setFullName(user.getFullName());
        entity.setPhoneNumber(user.getPhoneNumber());

        return entity;
    }
}
