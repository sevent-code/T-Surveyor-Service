/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.service;

import com.demo.surveyorservice.exception.MyResourceNotFoundException;
import com.demo.surveyorservice.model.Surveyor;
import com.demo.surveyorservice.repository.SurveyorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steven Raylianto K.
 */
@Service
public class SurveyorService {

    @Autowired
    private SurveyorRepository surveyorRepository;

    public Surveyor findById(Long id) {
        return surveyorRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException(id));
    }
}
