package com.FoodDelivery.service;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.entities.SysUserEntity;
import com.FoodDelivery.enitities.SysUserRepository;
import com.FoodDelivery.mapper.SysUserMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SysUserService {
    private final SysUserRepository sysUserRepository;
    private static SysUserMapper mapper;

    // ✅ Constructor injection — best practice in Spring
    public SysUserService(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    @Transactional()
    public Optional<SysUserDomain> findUserById(Integer id) {
        return sysUserRepository.findById(id).map(SysUserMapper::toUserDomain); // ✅ calling repository method
    }

    @Transactional
    public SysUserEntity createUser(SysUserEntity user) {
        return sysUserRepository.save(user); // ✅ calling save()
    }

    @Transactional
    public SysUserEntity updateUser(SysUserEntity user) {
        return sysUserRepository.save(user); // ✅ calling save() again
    }

    @Transactional
    public void deleteUser(Integer id) {
        sysUserRepository.deleteById(id); // ✅ calling deleteById()
    }

    @Transactional()
    public SysUserEntity findByUsername(String username) {
        return sysUserRepository.findByUsername(username); // ✅ custom query
    }
}