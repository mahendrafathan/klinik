/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.web.controller;

import com.app.model.Pasien;
import com.app.model.TipePelayanan;
import com.app.model.Treatment;
import com.app.repo.PasienRepository;
import com.app.repo.TipePelayananRepository;
import com.app.repo.TreatmentRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author PROSIA
 */
@Controller
@Scope("view")
@Data
public class TreatmentMBean implements InitializingBean {
    
    @Autowired
    private PasienRepository pasienRepo;
    private Pasien pasien;
    
    @Autowired
    private TipePelayananRepository tipePelayananRepo;
    private List<TipePelayanan> listTipePelayanan;
    private TipePelayanan tipePelayanan;
    
    @Autowired
    private TreatmentRepository treatmentRepo;
    private List<Treatment> listTreatment;
    private Treatment treatment;

    @Override
    public void afterPropertiesSet() throws Exception {
        pasien = new Pasien();
        listTipePelayanan = new ArrayList<>();
        listTreatment = new ArrayList<>();
        listTipePelayanan = tipePelayananRepo.findAll();
    }
    
    public void onChangeTipePelayanan() {
        if (tipePelayanan != null) {
            listTreatment = treatmentRepo.findAllByTipeId(tipePelayanan);
        } else {
            listTreatment = new ArrayList<>();
        }
    }
    
}
