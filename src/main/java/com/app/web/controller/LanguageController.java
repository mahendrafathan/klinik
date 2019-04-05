/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.web.controller;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import javax.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author RANDY
 */
@Controller
@Scope("session")
public class LanguageController implements InitializingBean {

    @Getter
    private final Locale localeID = new Locale("in", "ID");
    
    @Getter
    private final Locale localeEN = Locale.ENGLISH;
    
    @Getter
    @Setter
    private boolean reloadMenuLanguage;

    @Getter
    private Locale currentLocale;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (FacesContext.getCurrentInstance().getApplication().getDefaultLocale() == null) {
            this.currentLocale = localeID;
        } else {
            this.currentLocale = FacesContext.getCurrentInstance().getApplication().getDefaultLocale();
        }
    }

    /**
     * Change application language.
     *
     * @param locale
     * @throws java.io.IOException
     */
    public void changeLanguage(Locale locale) throws IOException {
        this.currentLocale = locale;
        this.reloadMenuLanguage = true;

        // refresh page
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String fullUrl = paramMap.get("id");
        FacesContext.getCurrentInstance().getExternalContext().redirect(fullUrl);
    }

}
