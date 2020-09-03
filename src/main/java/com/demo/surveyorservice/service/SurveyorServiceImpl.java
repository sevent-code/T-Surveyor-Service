/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.service;

import com.demo.surveyorservice.exception.MyResourceException;
import com.demo.surveyorservice.exception.MyResourceNotFoundException;
import com.demo.surveyorservice.model.Surveyor;
import com.demo.surveyorservice.repository.SurveyorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steven Raylianto K.
 */
@Service
public class SurveyorServiceImpl implements SurveyorService {

    @Autowired
    private SurveyorRepository surveyorRepository;

    public Surveyor findById(Long id) {
        return surveyorRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException(id));
    }

    @Override
    public Surveyor createSurveyor(Surveyor surveyor) {
        return surveyorRepository.save(surveyor);
    }

    @Override
    public Surveyor updateSurveyor(Long id, Surveyor requestSurveyor) {
        return surveyorRepository.findById(id).map(surveyor -> {
            surveyor = new Surveyor(requestSurveyor.getName(), requestSurveyor.getMsisdn(), requestSurveyor.getAddress(), requestSurveyor.getEmail(), requestSurveyor.getStatusSurveyor());
            return surveyorRepository.save(surveyor);
        }).orElseThrow(() -> new MyResourceException("Error when updating surveyor with id " + id));
    }

    @Override
    public ResponseEntity<?> deleteSurveyor(Long id) {
        return surveyorRepository.findById(id).map(surveyor -> {
            surveyorRepository.delete(surveyor);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new MyResourceException("Error when deleting surveyor with id " + id));
                
    }
}
