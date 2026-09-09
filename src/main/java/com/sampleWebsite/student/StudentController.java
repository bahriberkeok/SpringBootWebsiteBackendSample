package com.sampleWebsite.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Optional<StudentModel> getStudentById(@PathVariable Long id) {
        try {
            return studentService.getStudentById(id);
        } catch (RuntimeException e) {
            log.error("e: ", new StudentNotFoundException());
            return Optional.empty();
        }

    }

    @PutMapping("/{id}")
    public StudentModel updateStudent (@PathVariable Long id, @RequestBody StudentModel studentDetails) {
        try {
            return studentService.updateStudent(id, studentDetails);
        } catch (RuntimeException e) {
            log.error("e: ", new StudentNotFoundException());
            return null;
        }

    }

    @PostMapping("/admin/newstudent")
    public StudentModel setStudent(@RequestBody StudentModel student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/allstudents")
    public List<StudentModel> getAllStudents() {
        return studentService.getAllStudents();
    }
    @PostMapping("/admin/{id}/delete")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }


}
