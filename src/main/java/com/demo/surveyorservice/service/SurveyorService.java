/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.service;

import com.demo.surveyorservice.model.Surveyor;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Steven Raylianto K.
 */
public interface SurveyorService {
    Surveyor createSurveyor(Surveyor surveyor) throws Exception;
    void deleteSurveyor(Long id) throws Exception;
    Surveyor findById(Long id) throws Exception;
    Surveyor updateSurveyor(Long id, Surveyor requestSurveyor) throws Exception;
    Surveyor validateOtpRegistration(Long id, String otp) throws Exception;
}
