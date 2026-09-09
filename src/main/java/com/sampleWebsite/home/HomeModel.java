package com.sampleWebsite.home;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "home")
public class HomeModel {

    @Getter private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Getter @Setter String HomeTitle;
    @Getter @Setter String HomeContent;

    public HomeModel() {

    }

    @Override
    public String toString() {
        return "HomeModel{" +
                "id=" + id +
                ", home_title='" + HomeTitle + '\'' +
                ", home_content='" + HomeContent + '\'' +
                '}';
    }

}

