/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.controller;

import com.demo.surveyorservice.model.Surveyor;
import com.demo.surveyorservice.service.SurveyorService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/{surveyorId}")
    public Surveyor getOrders(@PathVariable("surveyorId") Long surveyorId) throws Exception {
        return surveyorService.findById(surveyorId);
    }
}
