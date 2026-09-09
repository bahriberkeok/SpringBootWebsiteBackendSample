package com.sampleWebsite.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private final AdminRepository AdminRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    @Lazy
    public AdminServiceImpl(AdminRepository AdminRepository, PasswordEncoder passwordEncoder) {
        this.AdminRepository = AdminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AdminModel getByUsername(String username) {
        return AdminRepository.getByUsername(username);
    }


    public AdminModel getRole(String username) {
        return null;
    }


    @Override
    public AdminModel createUser(AdminModel AdminModel) {
        AdminModel.setPassword(passwordEncoder.encode(AdminModel.getPassword()));
        return AdminRepository.save(AdminModel);
    }
}
