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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author flopy
 */
@CrossOrigin//(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthorizedController {
    @Autowired
    private PortfolioService portServ;
    // update desde FE
    @PostMapping("/update/info")
    public void updateInfo(@RequestBody PseudoInfoDTO info){
        portServ.updateInfo(info);
    }
    
    @PostMapping("/borrar/info")
    public void borrarInfo(@RequestBody Long id){
        portServ.borrarInfo(id);
    }
    
    @PostMapping("/update/person")
    public void crearPerson(@RequestBody Person person){
        portServ.crearPerson(person);
    }
    
    @PostMapping("/crear/info")
    @ResponseBody
    public Long crearInfo(@RequestBody PseudoInfoDTO info){
        return portServ.crearInfo(info);
    }
    
    @PostMapping("/crear/seccion")
    public Long crearSeccion(@RequestBody PseudoSeccionDTO pseudo_seccion){
        return portServ.crearSeccion(pseudo_seccion);
    }
    
    @PostMapping("/borrar/seccion")
    public void borrarSeccion(@RequestBody Long id){
        portServ.borrarSeccion(id);
    }
    
    @PostMapping("/update/seccion")
    public void updateSeccion(@RequestBody SeccionDTO seccion){
        portServ.updateSeccionTitulo(seccion);
    }
    
    //SetUp DB
    @PostMapping("/crear/tipo/{nombre}")
    public void crearTipo(@PathVariable String nombre){
        portServ.crearTipo(nombre);
    }  
}
