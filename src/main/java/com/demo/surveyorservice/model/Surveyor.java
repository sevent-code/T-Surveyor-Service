/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Steven Raylianto K.
 */
@Entity
@Table(name = "surveyor")
public class Surveyor {

    private Long id;
    private String name;
    private String msisdn;
    private String address;

    public Surveyor() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "surveyor_seq")
    @SequenceGenerator(name = "surveyor_seq", sequenceName = "surveyor_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Surveyor{" + "name=" + name + ", msisdn=" + msisdn + ", address=" + address + '}';
    }

}
