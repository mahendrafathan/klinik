/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Owner
 */
@Entity
@Table(name = "obat")
@Data
public class Obat implements Serializable {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "obat_id", nullable = false)
    private Integer obatId;

    @Column(name = "kode")
    private String kode;

    @Column(name = "nama")
    private String nama;
    
    @Column(name = "harga")
    private Integer harga;
    
    @Column(name = "dosis")
    private Integer dosis;
    
    @Column(name = "stok")
    private Integer stok;
    
    @Column(name = "keterangan")
    private String keterangan;
   
}
