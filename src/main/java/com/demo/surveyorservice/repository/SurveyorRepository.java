/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.repository;

import com.demo.surveyorservice.model.Surveyor;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Steven Raylianto K.
 */
@Repository
public interface SurveyorRepository extends CrudRepository<Surveyor, Long>{
    Optional<Surveyor> findByMsisdnAndPassword(String msisdn, String password);
}
