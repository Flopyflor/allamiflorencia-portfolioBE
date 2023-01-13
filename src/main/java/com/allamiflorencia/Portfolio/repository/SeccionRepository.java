/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.repository;

import com.allamiflorencia.Portfolio.model.Seccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author flopy
 */
@Repository
public interface SeccionRepository extends JpaRepository <Seccion, Long>{
    
    @Query(value="SELECT * FROM seccion WHERE seccion.titulo= BINARY ?1", nativeQuery=true)
    public Seccion findSeccionByNombre(String nombre);
    
    @Query(value="SELECT seccion.titulo FROM seccion", nativeQuery=true)
    public List<String> getTitulos();
}