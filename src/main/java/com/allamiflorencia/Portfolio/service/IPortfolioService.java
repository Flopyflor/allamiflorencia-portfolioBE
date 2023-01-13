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
    //Tipo setup
    public void crearTipo(String tipo);
    /*
    Esta función se puede usar para dinamicamente obtener las opciones de 
    tipos de secciones desde el front end. Al final la idea fue descartada
    porque tendría que editar en la DB para que también aparezca el nombre en 
    español, y so solo el nombre del componente, en inglés y sin espacios.
    
    El posible cambio es considerado de baja prioridad porque si se quisiera 
    agregar otro tipo de sección, también debería generarse el componente 
    específico.
    */
    public List<String> traerTiposTitulos(); 
    
    /*
    Los "crear*" que se usan desde el front end devuelven su propio id (Long)
    */
    
    //Sección
    public Long crearSeccion(PseudoSeccionDTO pseudo_seccion);
    public void borrarSeccion(Long id);
    public void updateSeccionTitulo(SeccionDTO seccion);
    public List<String> traerSeccionTitulo();
    
    //Secciones e Infos
    public List<SeccionDTO> traerSeccionesDTO();
    
    //Info
    public Long crearInfo(PseudoInfoDTO pseudo_info);
    public void borrarInfo(Long id);
    public void updateInfo(PseudoInfoDTO pseudo_info);
    
    //Person, más bien un update
    public void crearPerson(Person person);
    
    //DB debug
    public List<Tipo> traerTipos();
    public List<Seccion> traerSecciones();
    public List<Info> traerInfo();
    public Person traerPerson();
}
