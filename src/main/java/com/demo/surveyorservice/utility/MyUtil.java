/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.surveyorservice.utility;


import com.demo.surveyorservice.dto.ApiResponse;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Steven Raylianto K.
 */
public class MyUtil {

    public static ApiResponse buildResponseWrapper(String message, Object data) {
        return new ApiResponse(
                LocalDateTime.now(),
                HttpStatus.OK, 
                message, 
                data);
    }
}
