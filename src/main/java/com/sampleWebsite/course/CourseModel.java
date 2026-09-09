package com.sampleWebsite.course;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalTime;

@Entity
@Table(name = "course")
public class CourseModel {

    @Getter private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Getter @Setter private String CourseTitle;
    @Getter @Setter private String CourseCode;
    @Getter @Setter private String CourseSubject;
    @Getter @Setter private String CourseDuration;
    @Getter @Setter private Integer CourseYear;
    @Getter @Setter private Integer CourseTrimester;
    @Getter @Setter private LocalTime CourseTime;
    @Getter @Setter private Integer CourseCredit;
    @Getter @Setter private String CourseDescription;
    @Getter @Setter private Boolean IsCourseActive;
    @Getter @Setter private Timestamp CourseCreatedAt;
    @Getter @Setter private Timestamp CourseUpdatedAt;
    @Getter @Setter private String CourseCategory;

    public CourseModel() {

    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "id=" + id +
                ", course_code='" + CourseCode + '\'' +
                ", course_title='" + CourseTitle + '\'' +
                ", course_subject= " + CourseSubject + '\''+
                ", course_duration= " + CourseDuration + '\''+
                ", course_year= " + CourseYear + '\''+
                ", course_trimester= " + CourseTrimester + '\''+
                ", course_time= " + CourseTime + '\''+
                ", course_fee= " + CourseCredit + '\''+
                ", course_description= " + CourseDescription + '\''+
                ", course_active= " + IsCourseActive + '\''+
                ", course_createdat= " + CourseCreatedAt + '\''+
                ", course_updatedat= " + CourseUpdatedAt + '\''+
                ", course_category= " + CourseCategory + '\''+
                '}';
    }
}
