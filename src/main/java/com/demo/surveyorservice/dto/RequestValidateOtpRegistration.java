/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.dto;

/**
 *
 * @author Steven Raylianto K.
 */
public class RequestValidateOtpRegistration {

    private Long id;
    private String otp;

    public RequestValidateOtpRegistration() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "RequestValidateOtpRegistration{" + "id=" + id + ", otp=" + otp + '}';
    }

}
