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
@Table(name = "pasien")
@Data
public class Pasien implements Serializable {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pasien_id", nullable = false)
    private Integer pasienId;

    @Column(name = "nama")
    private String nama;

    @Column(name = "kode")
    private String kode;

    @Column(name = "nik")
    private String nik;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "no_hp")
    private String noHp;

    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;

    @Column(name = "tempat_lahir")
    private String tempatLahir;
    
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    
    @Column(name = "email")
    private String email;
    
}
