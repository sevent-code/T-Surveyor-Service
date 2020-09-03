/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.service;

import com.demo.surveyorservice.enums.StatusSurveyor;
import com.demo.surveyorservice.exception.MyResourceException;
import com.demo.surveyorservice.exception.MyResourceNotFoundException;
import com.demo.surveyorservice.model.Surveyor;
import com.demo.surveyorservice.repository.SurveyorRepository;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Surveyor createSurveyor(Surveyor surveyor) throws Exception {
        return surveyorRepository.save(surveyor);
    }
    
    @Override
    public void deleteSurveyor(Long id) throws Exception {
        Optional<Surveyor> optSurveyor = surveyorRepository.findById(id);
        Surveyor surveyor = optSurveyor.get();
        surveyor.setStatusSurveyor(StatusSurveyor.DELETED);
        surveyorRepository.save(surveyor);
    }
    
    @Override
    public Surveyor findById(Long id) {
        return surveyorRepository.findById(id).orElseThrow(() -> new MyResourceNotFoundException(id));
    }

    @Override
    public Surveyor updateSurveyor(Long id, Surveyor requestSurveyor) throws Exception {
        return surveyorRepository.findById(id).map(surveyor -> {
            surveyor = new Surveyor(requestSurveyor.getName(), requestSurveyor.getMsisdn(), requestSurveyor.getAddress(), requestSurveyor.getEmail(), requestSurveyor.getStatusSurveyor());
            return surveyorRepository.save(surveyor);
        }).orElseThrow(() -> new MyResourceException("Error when updating surveyor with id " + id));
    }

    @Override
    public Surveyor validateOtpRegistration(Long id, String otp) throws Exception {
        //TO-DO SEND SERVICE VALIDATE OTP
        return surveyorRepository.findById(id).map(surveyor -> {
            surveyor.setStatusSurveyor(StatusSurveyor.ACTIVE);
            return surveyorRepository.save(surveyor);
        }).orElseThrow(() -> new MyResourceException("Error when update status surveyor with id " + id));
    }
}
