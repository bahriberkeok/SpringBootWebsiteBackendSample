package com.sampleWebsite.agenda;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

    @RestControllerAdvice
    public class AgendaNotFoundException extends RuntimeException {
        AgendaNotFoundException() {
            super("Agenda Not Found");
        }
        @ExceptionHandler(AgendaNotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String agendaNotFoundHandler(AgendaNotFoundException ex) {
            return ex.getMessage();
        }
    }
