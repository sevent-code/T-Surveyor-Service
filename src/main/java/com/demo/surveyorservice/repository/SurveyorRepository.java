/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.repository;

import com.demo.surveyorservice.model.Surveyor;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Steven Raylianto K.
 */
public interface SurveyorRepository extends CrudRepository<Surveyor, Long>{

}
