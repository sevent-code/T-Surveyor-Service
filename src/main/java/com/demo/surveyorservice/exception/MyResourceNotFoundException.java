/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.exception;

/**
 *
 * @author Steven Raylianto K.
 */
public class MyResourceNotFoundException extends RuntimeException {

    public MyResourceNotFoundException(Long id) {
        super("Surveyor with id " + id + " does not exist");
    }
}
