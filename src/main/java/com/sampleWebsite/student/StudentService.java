package com.sampleWebsite.student;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentModel saveStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    public List<StudentModel> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<StudentModel> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public StudentModel updateStudent(Long id, StudentModel studentDetails) {
        StudentModel user = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
        user.setStudentName(studentDetails.getStudentName());
        user.setStudentSurname(studentDetails.getStudentSurname());
        user.setStudentAddress(studentDetails.getStudentAddress());
        user.setStudentCity(studentDetails.getStudentCity());
        user.setStudentBirthday(studentDetails.getStudentBirthday());
        user.setStudentCountry(studentDetails.getStudentCountry());
        user.setStudentEmail(studentDetails.getStudentEmail());
        user.setStudentCourses(studentDetails.getStudentCourses());
        user.setStudentNationality(studentDetails.getStudentNationality());
        user.setStudentCourseChoice(studentDetails.getStudentCourseChoice());
        user.setIsStudentPaid(studentDetails.getIsStudentPaid());
        user.setStudentPhoneNumber(studentDetails.getStudentPhoneNumber());
        user.setStudentInstallmentChoice(studentDetails.getStudentInstallmentChoice());
        user.setStudentTermsAndConditions(studentDetails.getStudentTermsAndConditions());
        user.setStudentPostCode(user.getStudentPostCode());
        user.setStudentPaymentMethod(user.getStudentPaymentMethod());
        return studentRepository.save(user);
    }

}
