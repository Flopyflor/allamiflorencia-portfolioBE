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
@Setter @Getter
public class PseudoInfoDTO {
    private Long id;
    private String titulo;
    private String link; //representa una imagen(card) o un link(proyecto) o vacio(progress bar)
    private String descripcion; //es un porcentaje en caso de ser una progress bar
    
    //el que necesito convertir a su objeto
    private String seccion; //a la que pertenece. la seccion contiene la info sobre el tipo de cosa q es
}
