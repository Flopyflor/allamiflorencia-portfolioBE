/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.repository;

import com.allamiflorencia.Portfolio.model.Tipo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author flopy
 */
@Repository
public interface TipoRepository extends JpaRepository <Tipo, Long>{
    
    @Query(value="SELECT * FROM tipo WHERE tipo.tipo=?1", nativeQuery=true)
    public Tipo findTipoByNombre(String nombre);
    
    @Query(value="Select tipo.tipo from tipo", nativeQuery=true)
    public List<String> getTitulos();
}