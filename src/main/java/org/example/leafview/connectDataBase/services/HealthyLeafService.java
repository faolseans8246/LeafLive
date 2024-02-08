package org.example.leafview.connectDataBase.services;


import org.example.leafview.connectDataBase.Model.HealthyImageTable;
import org.example.leafview.connectDataBase.repositories.HealthyLeafRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class HealthyLeafService {


    @Autowired
    private HealthyLeafRepository healthyLeafRepository;


    //  Bazadagi rasmlarni olish
    public List<HealthyImageTable> getAllImages() {
        return healthyLeafRepository.findAll();
    }

    // Bazaga rasmlarni saqlash
    public HealthyImageTable saveHelthyImages(HealthyImageTable healthyImageTable) {
        return healthyLeafRepository.save(healthyImageTable);
    }

}
