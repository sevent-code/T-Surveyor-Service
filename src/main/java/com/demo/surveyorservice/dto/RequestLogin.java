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
public class RequestLogin {

    private String msisdn;
    private String password;

    public RequestLogin() {
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RequestLogin{" + "msisdn=" + msisdn + ", password=" + password + '}';
    }

}
