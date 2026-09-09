package com.sampleWebsite.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class AdminController {

    private final AdminService adminService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AdminController(AdminService adminService, PasswordEncoder passwordEncoder) {
        this.adminService = adminService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody AdminModel user) {
        AdminModel existingUser = adminService.getByUsername(user.getUsername());
        if (existingUser != null) {
            return "Email already exists";
        }
        adminService.createUser(user);
        return "User registered successfully";
    }


    @PostMapping("/login")
    public String login(@RequestBody AdminModel user) {
        AdminModel existingUser = adminService.getByUsername(user.getUsername());
        AdminModel existingUserRole = adminService.getByUsername(user.getUsername());
        if (existingUser != null && passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            if (Objects.equals(existingUserRole.getRole(), "ADMIN")) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
                return "Admin Login successful";
            }
            else {
                return "Login successful";
            }
        } else {
            return "Invalid credentials";
        }

    }

    @GetMapping("/logout")
    public void logout() {
            SecurityContextHolder.clearContext();
        }

    }
