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
    private String password;
    private String reTypePassword;
    private String address;
    private String email;

    public ReqestCreateSurveyor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getReTypePassword() {
        return reTypePassword;
    }

    public void setReTypePassword(String reTypePassword) {
        this.reTypePassword = reTypePassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ReqestCreateSurveyor{" + "name=" + name + ", msisdn=" + msisdn + ", password=" + password + ", reTypePassword=" + reTypePassword + ", address=" + address + ", email=" + email + '}';
    }

}
