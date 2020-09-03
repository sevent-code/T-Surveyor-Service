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
public class ReqestCreateSurveyor {

    private String name;
    private String msisdn;
    private String address;
    private String email;

    public ReqestCreateSurveyor() {
    }

    public String getName() {
        return name;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ReqestCreateSurveyor{" + "name=" + name + ", msisdn=" + msisdn + ", address=" + address + ", email=" + email + '}';
    }

}
