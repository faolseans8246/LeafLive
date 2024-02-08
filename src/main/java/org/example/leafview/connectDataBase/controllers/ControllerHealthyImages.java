package org.example.leafview.connectDataBase.controllers;


import org.example.leafview.connectDataBase.Model.HealthyImageTable;
import org.example.leafview.connectDataBase.services.HealthyLeafService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(name = "/api")
public class ControllerHealthyImages {


    @Autowired
    private HealthyLeafService healthyLeafService;


    /**
     *
     * Berilgan faylni olib jadvalga joylashtiruvchi method
     *
     * @param file
     * @return
     * @throws Exception
     */
    public HealthyImageTable getImageFromMemory(@RequestParam("file") MultipartFile file) throws Exception {

        String folderName = "D:\\ZakazProjects\\Java\\BahodirDomla\\Sources\\tomato\\tomato\\Tomato___healthy";
        String fileName = file.getOriginalFilename();
        String filePath = folderName + File.separator + fileName;
        long fileSize = file.getSize();

        saveHealthyLeafImages(file, filePath);

        HealthyImageTable newHealthyImageTable = new HealthyImageTable();
        newHealthyImageTable.setHealthy_leaf_name(fileName);
        newHealthyImageTable.setHealthy_leaf_path_leaf(filePath);
        newHealthyImageTable.setSize_healthy_leaf(fileSize);

        return healthyLeafService.saveHelthyImages(newHealthyImageTable);

    }


    /**
     *
     * Berilgan filedagi rasmlarni parametrlarni moslab saqlovchi method
     *
     * @param file
     * @param filePath
     * @throws Exception
     */
    private void saveHealthyLeafImages(MultipartFile file, String filePath) throws Exception {
        byte[] bytes = file.getBytes();
        Path path = Paths.get(filePath);
        Files.write(path, bytes);
    }


}
