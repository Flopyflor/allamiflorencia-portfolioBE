/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.controller;

import com.allamiflorencia.Portfolio.DTO.SeccionDTO;
import com.allamiflorencia.Portfolio.model.Info;
import com.allamiflorencia.Portfolio.model.Person;
import com.allamiflorencia.Portfolio.model.Seccion;
import com.allamiflorencia.Portfolio.model.Tipo;
import com.allamiflorencia.Portfolio.service.PortfolioService;
import com.allamiflorencia.Portfolio.storage.FileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/api/no-auth")
public class PortfolioController {
    @Autowired
    private PortfolioService portServ;  

    @Autowired
    private FileService storage;
    
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
    
    @GetMapping("traer/tipos")
    @ResponseBody
    public List<String> traerTipos(){
        return portServ.traerTiposTitulos();
    }
    
    //storage
    @PostMapping(value="/loadFile", produces="text/plain")
    public String loadImage(@RequestBody String filename){
        return storage.loadImage(filename);
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
        return portServ.traerInfo();
    }
    
    @GetMapping("/ver/tipo")
    @ResponseBody
    public List<Tipo> verTipos(){
        return portServ.traerTipos();
    }
}
