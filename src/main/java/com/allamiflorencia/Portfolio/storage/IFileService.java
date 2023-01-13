/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.storage;

import com.allamiflorencia.Portfolio.DTO.ImagenDTO;

/**
 *
 * @author flopy
 */
public interface IFileService {
    public void storeImage(ImagenDTO imagen);
    public void deleteImage(String filename);
    public String loadImage(String filename);
}
