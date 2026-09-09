package com.sampleWebsite.course;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CourseNotFoundException extends RuntimeException {
    CourseNotFoundException() {
        super("Course Not Found");
    }
    @ExceptionHandler(CourseNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(CourseNotFoundException ex) {
        return ex.getMessage();
    }
}
