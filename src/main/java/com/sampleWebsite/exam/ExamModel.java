package com.sampleWebsite.exam;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "exam")
public class ExamModel {

    @Getter private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Getter private String ExamTitle;
    @Getter private String ExamSubject;
    @Getter private Date ExamDate;
    @Getter private Time ExamTime;
    @Getter private String ExamLocation;
    @Getter private Integer ExamFee;
    @Getter private String ExamDescription;
    @Getter private Boolean IsExamActive;
    @Getter private Timestamp ExamCreatedAt;
    @Getter private Timestamp ExamUpdatedAt;
    @Getter private String ExamCategory;

    public ExamModel() {

    }

    @Override
    public String toString() {
        return "ExamModel{" +
                "id=" + id +
                ", exam_title='" + ExamTitle + '\'' +
                ", exam_subject= " + ExamSubject + '\''+
                ", exam_date= " + ExamDate + '\''+
                ", exam_time= " + ExamTime + '\''+
                ", exam_location= " + ExamLocation + '\''+
                ", exam_fee= €" + ExamSubject + '\''+
                ", exam_description= " + ExamDescription + '\''+
                ", exam_active= " + IsExamActive + '\''+
                ", exam_createdat= " + ExamCreatedAt + '\''+
                ", exam_updatedat= " + ExamUpdatedAt + '\''+
                ", exam_category= " + ExamCategory + '\''+
                '}';
    }

}
