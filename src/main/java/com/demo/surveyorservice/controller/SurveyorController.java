/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.controller;

import com.demo.surveyorservice.dto.ApiResponse;
import com.demo.surveyorservice.dto.ReqestCreateSurveyor;
import com.demo.surveyorservice.dto.RequestId;
import com.demo.surveyorservice.dto.RequestValidateOtpRegistration;
import com.demo.surveyorservice.enums.StatusSurveyor;
import com.demo.surveyorservice.model.Surveyor;
import com.demo.surveyorservice.service.SurveyorServiceImpl;
import com.demo.surveyorservice.utility.MyUtil;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Steven Raylianto K.
 */
@RestController
@RequestMapping("/surveyor")
public class SurveyorController {

    @Autowired
    private SurveyorServiceImpl surveyorService;

    @PostMapping("/create")
    @ApiOperation(value = "Create a new surveyor", response = ApiResponse.class)
    public ApiResponse createSurveyor(@RequestBody ReqestCreateSurveyor requestData, HttpServletRequest http) throws Exception {
        System.out.println("Request From " + http.getRemoteAddr() + " on " + http.getServletPath());
        System.out.println("Data -> " + requestData.toString());

        Surveyor surveyor = new Surveyor(requestData.getName(), requestData.getMsisdn(), requestData.getAddress(), requestData.getEmail(), StatusSurveyor.OTP_VERIFICATION);
        surveyor = surveyorService.createSurveyor(surveyor);
        return MyUtil.buildResponseWrapper("Surveyor created successfull", surveyor);
    }
    
    @DeleteMapping("/delete")
    @ApiOperation(value = "Delete surveyor - only change the status surveyor to DELETED", response = ApiResponse.class)
    public ApiResponse deleteSurveyor(@RequestBody RequestId data, HttpServletRequest http) throws Exception {
        System.out.println("Request From " + http.getRemoteAddr() + " on " + http.getServletPath());
        surveyorService.deleteSurveyor(data.getId());
        return MyUtil.buildResponseWrapper("Success", null);
    }

    @PostMapping("/validate-otp-registration")
    @ApiOperation(value = "Validate otp registration that send after fill the form", response = ApiResponse.class)
    public ApiResponse validateOtpRegistration(@RequestBody RequestValidateOtpRegistration requestData, HttpServletRequest http) throws Exception {
        System.out.println("Request From " + http.getRemoteAddr() + " on " + http.getServletPath());
        System.out.println("Data -> " + requestData.toString());
        
        Surveyor surveyor = surveyorService.validateOtpRegistration(requestData.getId(), requestData.getOtp());
        return MyUtil.buildResponseWrapper("Success", surveyor);
    }
    
    
}
