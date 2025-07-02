package com.FoodDelivery.enitities;

import com.FoodDelivery.entities.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUserEntity, Integer> {
    SysUserEntity findByUsername(String username);
}
