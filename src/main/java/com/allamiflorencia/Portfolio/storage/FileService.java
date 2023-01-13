/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.Portfolio.storage;

import com.allamiflorencia.Portfolio.DTO.ImagenDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import org.springframework.stereotype.Service;

/**
 *
 * @author flopy
 */
@Service
public class FileService implements IFileService {
    
    private static final String PATH = "assets";
    
    @Override
    public void storeImage(ImagenDTO imagen){
        try {
            String data = imagen.getImagen();
            String filename = imagen.getNombre();

            data = data.substring(data.indexOf(",")+1);

            byte[] imageByte = Base64.getMimeDecoder().decode(data);


            Path path = Paths.get(PATH);   
            path = path.resolve(filename);
            path = path.toAbsolutePath();
            File outputFile = path.toFile();

            Files.write(outputFile.toPath(), imageByte);
        } catch (IOException e) {
            System.out.println("Error storing image");
        }
    }
    
    @Override
    public void deleteImage(String filename){
        Path path = Paths.get(PATH);
        path = path.resolve(filename);
        path = path.toAbsolutePath();
        File file = path.toFile();
        
        file.delete();
    }

    @Override
    public String loadImage(String filename){
        Path path = Paths.get(PATH);
        path = path.resolve(filename);
        path = path.toAbsolutePath();
        File file = path.toFile();
        
        try{
            byte[] imageBytes;
            try (FileInputStream stream = new FileInputStream(file)) {
                imageBytes = stream.readAllBytes();
            }
            return "data:image/png;base64,\n"+ Base64.getMimeEncoder().encodeToString(imageBytes);
        } catch (FileNotFoundException ex){
            System.out.println(ex);
        } catch (IOException ex){
            System.out.println(ex);
        }
        return null;
    }
}
