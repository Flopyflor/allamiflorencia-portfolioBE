/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.allamiflorencia.Portfolio.storage;

import com.allamiflorencia.Portfolio.DTO.ImagenDTO;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.springframework.core.io.Resource;

/**
 *
 * @author flopy
 */
public interface IFileService {
    public void deleteImage(String filename);
    public void storeImage(ImagenDTO imagen);
    public String loadImage(String filename);
}
