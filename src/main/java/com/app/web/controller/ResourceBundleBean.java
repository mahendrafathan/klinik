/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.web.controller;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Randy
 */
@Controller(value = "msg")
@Scope("session")
public class ResourceBundleBean extends HashMap {

    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private LanguageController languageController;

    @Override
    public String get(Object key) {
        String message;
        try {
            message = messageSource.getMessage((String) key, null, languageController.getCurrentLocale());
        } catch (NoSuchMessageException e) {
            message = "???" + key + "???";
        }
        return message;
    }
    
}
