/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.repository;

import com.allamiflorencia.Portfolio.model.Info;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author flopy
 */
@Repository
public interface InfoRepository extends JpaRepository <Info, Long>{
    
    //@Query("SELECT i FROM info WHERE info.seccion=?1")
    @Query(value = "SELECT info.id, info.titulo, info.link, info.descripcion FROM info where info.seccion_id= ?1", nativeQuery=true)
    public List<Object[]> findDTOBySeccion(Long seccion_id);
    
    @Query(value = 
            "SELECT info.id FROM info "
                    + "WHERE info.titulo is null and "
                    + "info.link is null and "
                    + "info.descripcion is null and "
                    + "info.seccion_id = ?1", nativeQuery=true)
    public List<Long> findNewInfo(Long seccion_id);
}
