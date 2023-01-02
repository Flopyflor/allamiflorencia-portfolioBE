/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.DTO;

import com.allamiflorencia.Portfolio.model.Seccion;
import com.allamiflorencia.Portfolio.model.Tipo;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author flopy
 */
@Getter @Setter
public class PseudoSeccionDTO {
    private String titulo;
    private String tipo;

    public PseudoSeccionDTO(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }   
    
}
