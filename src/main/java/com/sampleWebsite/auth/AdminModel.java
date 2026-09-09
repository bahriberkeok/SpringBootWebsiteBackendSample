package com.sampleWebsite.auth;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "admin")
public class AdminModel {
        @Getter private @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
        @Getter @Setter private String username;
        @Getter @Setter private String firstname;
        @Getter @Setter private String lastname;
        @Getter @Setter private String email;
        @Getter @Setter private String password;
        @Getter @Setter private Date birthday;
        @Getter @Setter private String phone;
        @Getter @Setter private String role;


        @Override
        public String toString() {
                return "AdminModel{" +
                        "id=" + id +
                        ", username='" + username + '\'' +
                        ", password= " + password + '\''+
                        ", role= " + role + '\''+
                        '}';
        }


}
