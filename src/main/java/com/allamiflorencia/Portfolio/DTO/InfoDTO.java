/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author flopy
 */
@Getter @Setter
public class InfoDTO {
    private String titulo;
    private String link; 
    private String descripcion;
    
    @Override
    public String toString(){
        return "titulo: "+this.titulo+"; link: "+this.link+"; descripcion: "+this.descripcion;
    }
}
