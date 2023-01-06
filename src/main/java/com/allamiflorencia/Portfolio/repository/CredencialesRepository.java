/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.repository;

import com.allamiflorencia.Portfolio.model.Credenciales;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author flopy
 */
public interface CredencialesRepository extends JpaRepository<Credenciales, Long> {
    @Query(value="SELECT * FROM credenciales WHERE credenciales.usuario = ?1 AND credenciales.password = ?2", nativeQuery= true)
    public List<Credenciales> hallarLogin(String usuario, String password);
}
