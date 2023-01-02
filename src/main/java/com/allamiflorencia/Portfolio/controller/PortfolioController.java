/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.controller;

import com.allamiflorencia.Portfolio.DTO.PseudoInfoDTO;
import com.allamiflorencia.Portfolio.DTO.PseudoSeccionDTO;
import com.allamiflorencia.Portfolio.DTO.SeccionDTO;
import com.allamiflorencia.Portfolio.model.Person;
import com.allamiflorencia.Portfolio.service.PortfolioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author flopy
 */
@RestController
public class PortfolioController {
    @Autowired
    private PortfolioService portServ;
    
    @PostMapping("/crear/tipo/{nombre}")
    public void crearTipo(@PathVariable String nombre){
        portServ.crearTipo(nombre);
    }
    
    @PostMapping("/crear/seccion")
    public void crearSeccion(@RequestBody PseudoSeccionDTO pseudo_seccion){
        portServ.crearSeccion(pseudo_seccion);
    }
    
    @PostMapping("/crear/info")
    public void crearInfo(@RequestBody PseudoInfoDTO pseudo_info){
        portServ.crearInfo(pseudo_info);
    }
    
    @PostMapping("/crear/person")
    public void crearPerson(@RequestBody Person person){
        portServ.crearPerson(person);
    }
    
    @GetMapping("/traer/persona")
    @ResponseBody
    public Person traerPerson(){
        return portServ.traerPerson();
    }
    
    @GetMapping("/traer/secciones")
    @ResponseBody
    public List<SeccionDTO> traerSecciones(){
        return portServ.traerSecciones();
    }
}
