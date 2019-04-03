/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author Owner
 */
@Entity
@Table(name = "pemeriksaan")
@Data
public class Pemeriksaan implements Serializable {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pemeriksaan_id", nullable = false)
    private Integer pemeriksaanId;

    @Column(name = "dokter")
    private String dokter;

    @Column(name = "pasien")
    private String pasien;

    @Column(name = "tglPemeriksaan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglPemeriksaan;

    @Column(name = "keluhan")
    private String keluhan;

    @Column(name = "diagnosa")
    private String diagnosa;

    @Column(name = "treatment")
    private String treatment;
    
    @Column(name = "obat")
    private String obat;

}
