/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author flopy
 */
@Setter @Getter
@Entity
public class Seccion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    private String titulo;
    
    @ManyToOne
    private Tipo tipo;
    
    //@OneToMany(mappedBy="seccion")
    //private List<Info> data;
}
