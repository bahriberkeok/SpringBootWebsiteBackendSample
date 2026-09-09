package com.sampleWebsite.course;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseModel saveCourse(CourseModel course) {
        return courseRepository.save(course);
    }

    public List<CourseModel> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<CourseModel> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }

}
