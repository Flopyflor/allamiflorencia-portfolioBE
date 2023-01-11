/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.service;

import com.allamiflorencia.Portfolio.DTO.PseudoInfoDTO;
import com.allamiflorencia.Portfolio.DTO.PseudoSeccionDTO;
import com.allamiflorencia.Portfolio.DTO.SeccionDTO;
import com.allamiflorencia.Portfolio.model.Info;
import com.allamiflorencia.Portfolio.model.Person;
import com.allamiflorencia.Portfolio.model.Seccion;
import com.allamiflorencia.Portfolio.model.Tipo;
import java.util.List;

/**
 *
 * @author flopy
 */
public interface IPortfolioService {
    public void crearTipo(String tipo);
    public Long crearSeccion(PseudoSeccionDTO pseudo_seccion);
    public void borrarSeccion(Long id);
    public void updateSeccionTitulo(SeccionDTO seccion);
    public void updateInfo(PseudoInfoDTO pseudo_info);
    public Long crearInfo(PseudoInfoDTO pseudo_info);
    public void crearPerson(Person person);
    public Person traerPerson();
    public List<SeccionDTO> traerSeccionesDTO();
    public List<Tipo> traerTipos();
    public List<Seccion> traerSecciones();
    public List<Info> traerInfo();
    public List<String> traerSeccionTitulo();
    public List<String> traerTiposTitulos();
        
    public void borrarInfo(Long id);
}
