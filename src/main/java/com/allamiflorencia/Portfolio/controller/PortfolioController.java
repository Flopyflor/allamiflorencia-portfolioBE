/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.controller;

import com.allamiflorencia.Portfolio.DTO.PersonDTO;
import com.allamiflorencia.Portfolio.DTO.PseudoInfoDTO;
import com.allamiflorencia.Portfolio.DTO.PseudoSeccionDTO;
import com.allamiflorencia.Portfolio.DTO.SeccionDTO;
import com.allamiflorencia.Portfolio.model.Credenciales;
import com.allamiflorencia.Portfolio.model.Info;
import com.allamiflorencia.Portfolio.model.Person;
import com.allamiflorencia.Portfolio.model.Seccion;
import com.allamiflorencia.Portfolio.model.Tipo;
import com.allamiflorencia.Portfolio.service.PortfolioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PortfolioController {
    @Autowired
    private PortfolioService portServ;
    
    //SetUp DB
    @PostMapping("/crear/tipo/{nombre}")
    public void crearTipo(@PathVariable String nombre){
        portServ.crearTipo(nombre);
    }    
    
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
    
    
    // Yo armando la DB
    @PostMapping("/crear/login")
    public void crearLogin(@RequestBody Credenciales cred){
        portServ.crearLogin(cred);
    }
    
    
    
    //Pedidos de la pag
    @GetMapping("/traer/persona")
    @ResponseBody
    public Person traerPerson(){
        return portServ.traerPerson();
    }
    
    @GetMapping("/traer/secciones")
    @ResponseBody
    public List<SeccionDTO> traerSecciones(){
        return portServ.traerSeccionesDTO();
    }
    
    @GetMapping("/traer/secciones-titulo")
    @ResponseBody
    public List<String> traerSeccionesTitulo(){
        return portServ.traerSeccionTitulo();
    }
    
    
    //Login
    @PostMapping("/validar/login")
    @ResponseBody
    public String login(@RequestBody Credenciales cred){
        
        System.out.println("tratando de validar las credenciales");
        
        
        if(portServ.validarCredenciales(cred)){
            return "{\"accessToken\":\"JWT\"}";           
        } else {
            
            System.out.println("credenciales invalidas");
            
            return "";
        }
    }
    
    
    //DEBUG ver la info que tengo en la db
    @GetMapping("/ver/seccion")
    @ResponseBody
    public List<Seccion> verSecciones(){
        return portServ.traerSecciones();
    }
    
    @GetMapping("/ver/info")
    @ResponseBody
    public List<Info> verInfo(){
        System.out.println("estoy viendo la info");
        return portServ.traerInfo();
    }
    
    @GetMapping("/ver/tipo")
    @ResponseBody
    public List<Tipo> verTipos(){
        return portServ.traerTipos();
    }
}
