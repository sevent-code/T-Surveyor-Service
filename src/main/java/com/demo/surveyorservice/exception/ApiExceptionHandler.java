/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.exception;

import com.demo.surveyorservice.dto.ApiException;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Steven Raylianto K.
 */

@ControllerAdvice
public class ApiExceptionHandler {
    
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleApiRequestExcption(Exception e) {
        HttpStatus internalError = HttpStatus.INTERNAL_SERVER_ERROR;
        ApiException exception = new ApiException(
                LocalDateTime.now(),
                internalError,
                e.getMessage(),
                e
        );
        
        return new ResponseEntity<>(exception, internalError);
    };
    
    @ExceptionHandler(value = {MyResourceNotFoundException.class})
    public ResponseEntity<Object> handleApiRequestExcption(MyResourceNotFoundException e) {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        ApiException exception = new ApiException(
                LocalDateTime.now(),
                badRequest,
                e.getMessage(),
                e
        );
        
        return new ResponseEntity<>(exception, badRequest);
    };
    
    @ExceptionHandler(value = {MyResourceException.class})
    public ResponseEntity<Object> handleApiMyResourceException(MyResourceException e) {
        HttpStatus badRequest = HttpStatus.INTERNAL_SERVER_ERROR;
        ApiException exception = new ApiException(
                LocalDateTime.now(),
                badRequest,
                e.getMessage(),
                e
        );
        
        return new ResponseEntity<>(exception, badRequest);
    };
}
