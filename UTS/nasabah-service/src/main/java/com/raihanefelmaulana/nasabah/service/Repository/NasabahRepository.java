/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raihanefelmaulana.nasabah.service.Repository;

import com.raihanefelmaulana.nasabah.service.Entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository

public interface NasabahRepository extends JpaRepository<Nasabah, Long>{

    public Nasabah findByNasabahId(Long nasabahId);
    
}
