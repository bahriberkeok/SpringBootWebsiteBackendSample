package com.sampleWebsite.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends JpaRepository<AdminModel, Long> {

     AdminModel getByUsername(String username);

    @Query("SELECT role FROM admin WHERE username = :username")
    static String getRole(@Param("username") String username) {
        return username;
    }
}
