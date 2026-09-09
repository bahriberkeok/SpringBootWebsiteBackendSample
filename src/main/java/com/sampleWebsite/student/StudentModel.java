package com.sampleWebsite.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "student")
public class StudentModel {

    @Getter private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Getter @Setter private String StudentName;
    @Getter @Setter private String StudentSurname;
    @Getter @Setter private Date StudentRegistrationDate;
    @Getter @Setter private Date StudentBirthday;
    @Getter @Setter private String StudentAddress;
    @Getter @Setter private String StudentNationality;
    @Getter @Setter private String StudentEmail;
    @Getter @Setter private String StudentPhoneNumber;
    @Getter @Setter private String StudentPostCode;
    @Getter @Setter private String StudentCity;
    @Getter @Setter private String StudentCountry;
    @Getter @Setter private String[] StudentCourseChoice;
    @Getter @Setter private String[] StudentCourses;
    @Getter @Setter private String StudentEnrolmentQuarter;
    @Getter @Setter private String StudentPaymentMethod;
    @Getter @Setter private Boolean IsStudentPaid;
    @Getter @Setter private Integer StudentInstallmentChoice;
    @Getter @Setter private Boolean StudentTermsAndConditions;

    public StudentModel() {

    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", student_name='" + StudentName + '\'' +
                ", student_surname= " + StudentSurname + '\''+
                ", student_birthday= " + StudentBirthday + '\''+
                ", student_address= " + StudentAddress + '\''+
                ", student_nationality= " + StudentNationality + '\''+
                ", student_registration_date= " + StudentRegistrationDate + '\''+
                ", student_email= " + StudentEmail + '\''+
                ", student_phonenumber= " + StudentPhoneNumber + '\''+
                ", student_postcode= " + StudentPostCode + '\''+
                ", student_city= " + StudentCity + '\''+
                ", student_country= " + StudentCountry + '\''+
                ", student_course_choices= " + StudentCourseChoice + '\''+
                ", student_courses= " + StudentCourses + '\''+
                ", student_enrolment_quarter= " + StudentEnrolmentQuarter + '\''+
                ", student_payment_method= " + StudentPaymentMethod + '\''+
                ", is_student_paid= " + IsStudentPaid + '\''+
                ", student_installment= " + StudentInstallmentChoice + "mand/s" + '\''+
                ", is_student_agreed_to_terms= " + StudentTermsAndConditions + '\''+
                '}';
    }

//    public String setStudentName(String student_name) {
//        return this.StudentName = student_name;
//    }
//
//    public String setStudentSurname(String student_surname) {
//        return this.StudentSurname = student_surname;
//    }
//
//    public Date setStudentBirthday(Date student_birthday) {
//        return this.StudentBirthday = student_birthday;
//    }
//
//    public String setStudentNationality(String student_nationality) {
//        return this.StudentNationality = student_nationality;
//    }
//
//    public Date setStudentRegistrationDate(Date student_registration_date) {
//        return this.StudentRegistrationDate = student_registration_date;
//    }
//
//    public String setStudentEmail(String student_email) {
//        return this.StudentEmail = student_email;
//    }
//
//    public String setStudentPhoneNumber(String student_phonenumber) {
//        return this.StudentPostCode = student_phonenumber;
//    }
//
//    public String setStudentPostCode(String student_postcode) {
//        return this.StudentPostCode = student_postcode;
//    }
//
//    public String setStudentCity(String student_city) {
//        return this.StudentCity = student_city;
//    }
//
//    public String setStudentCountry(String student_country) {
//        return this.StudentCountry = student_country;
//    }
}
