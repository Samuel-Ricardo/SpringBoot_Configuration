/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.study_SpringConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samuel
 */

@RestController
public class AppController {
    
    @Value("${app.message}")
    private String appMessage;
    
    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;
    
    @GetMapping("/")
    public String getAppMessage() {
        
        return appMessage;
    }
    
    @GetMapping("/envVariable")
    public String getEnvironmentVariable(){
        return "A Seguinte dVariavél de Ambiente foi Passada: "+dbEnvironmentVariable;
    }
}
