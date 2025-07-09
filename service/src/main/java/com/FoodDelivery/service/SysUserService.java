package com.FoodDelivery.service;

import com.FoodDelivery.SysUserDomain;
import com.FoodDelivery.enitities.SysUserRepository;
import com.FoodDelivery.entities.SysUserEntity;
import com.FoodDelivery.mapper.DomainToEntityUserMapper;
import com.FoodDelivery.mapper.SysUserMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SysUserService {
    private final SysUserRepository sysUserRepository;
    private static SysUserMapper mapper;

    public SysUserService(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    @Transactional()
    public Optional<SysUserDomain> findUserById(Integer id) {
        return sysUserRepository.findById(id).map(SysUserMapper::toUserDomain);
    }

    @Transactional
    public SysUserEntity createUser(SysUserDomain user) {
        SysUserEntity entity = DomainToEntityUserMapper.toEntityMapper(user);

        return sysUserRepository.save(entity);
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
    public List<SysUserDomain> findAll() {
        return sysUserRepository.findAll().stream().map(SysUserMapper::toUserDomain).collect(Collectors.toList()); // ✅ custom query
    }
}