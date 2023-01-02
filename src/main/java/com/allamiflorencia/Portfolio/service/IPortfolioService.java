/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.service;

import com.allamiflorencia.Portfolio.DTO.PseudoInfoDTO;
import com.allamiflorencia.Portfolio.DTO.PseudoSeccionDTO;
import com.allamiflorencia.Portfolio.DTO.SeccionDTO;
import com.allamiflorencia.Portfolio.model.Person;
import java.util.List;

/**
 *
 * @author flopy
 */
public interface IPortfolioService {
    public void crearTipo(String tipo);
    public void crearSeccion(PseudoSeccionDTO pseudo_seccion);
    public void crearInfo(PseudoInfoDTO pseudo_info);
    public void crearPerson(Person person);
    public Person traerPerson();
    public List<SeccionDTO> traerSecciones();
}
