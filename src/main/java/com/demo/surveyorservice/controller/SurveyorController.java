/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.controller;

import com.demo.surveyorservice.model.Surveyor;
import com.demo.surveyorservice.service.SurveyorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    private SurveyorService surveyorService;

    @GetMapping("/{surveyorId}")
    @ApiOperation(value = "Find Surveyor by Id", response = Surveyor.class, notes = "Provide an id to look up from data surveyor")
    public Surveyor getOrders(@PathVariable("surveyorId") Long surveyorId) throws Exception {
        return surveyorService.findById(surveyorId);
    }
}
