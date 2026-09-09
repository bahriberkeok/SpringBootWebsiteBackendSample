package com.sampleWebsite.exam;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExamNotFoundException extends RuntimeException {
    ExamNotFoundException() {
        super("Exam Not Found");
    }
    @ExceptionHandler(ExamNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(ExamNotFoundException ex) {
        return ex.getMessage();
    }
}
