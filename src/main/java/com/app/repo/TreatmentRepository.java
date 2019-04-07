/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repo;

import com.app.model.TipePelayanan;
import com.app.model.Treatment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PROSIA
 */
@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Integer>, JpaSpecificationExecutor<Treatment> {
    
    public List<Treatment> findAllByTipeId(TipePelayanan tipeId);
    
}
