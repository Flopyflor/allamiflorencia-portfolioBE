/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.DTO;

import com.allamiflorencia.Portfolio.model.Info;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author flopy
 */
@Getter @Setter
public class SeccionDTO {
    private Long id;
    private String titulo;
    private String tipo;
    private List<InfoDTO> data;


    
}
