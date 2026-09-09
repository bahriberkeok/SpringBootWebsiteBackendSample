package com.sampleWebsite.auth;


import org.springframework.stereotype.Service;

@Service
public interface AdminService {


    AdminModel getByUsername(String username);

    AdminModel getRole(String username);

    AdminModel createUser(AdminModel AdminModel);
}