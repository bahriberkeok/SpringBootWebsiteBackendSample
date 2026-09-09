package com.sampleWebsite.course;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;

    CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/{id}")
    public Optional<CourseModel> getCourseById(@PathVariable Long id) {
        try {
            return courseService.getCourseById(id);
        } catch (RuntimeException e) {
            log.error("e: ", new CourseNotFoundException());
            return Optional.empty();
        }

    }

    @PostMapping("/admin/newcourse")
    public CourseModel setCourse(@RequestBody CourseModel course) {
        return courseService.saveCourse(course);
    }

    @GetMapping("/allcourses")
    public List<CourseModel> getAllCourses() {
        return courseService.getAllCourses();
    }
    @PostMapping("/admin/{id}/delete")
    public void deleteExamById(@PathVariable Long id) {
        courseService.deleteCourseById(id);
    }

    // CREATE (POST)
    //@PostMapping
    //public Exam setExam(@RequestBody Exam exam) {
    //    return repository.setExamTitle();
    //}


}
