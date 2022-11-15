/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raihanefelmaulana.peminjaman.service.Repository;

import com.raihanefelmaulana.peminjaman.service.Entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long>{
    public Peminjaman findByPeminjamanId(Long peminjamanId);
    
}
