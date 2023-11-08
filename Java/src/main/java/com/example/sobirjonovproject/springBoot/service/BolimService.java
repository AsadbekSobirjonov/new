package com.example.sobirjonovproject.springBoot.service;

import com.example.sobirjonovproject.springBoot.entity.Bolim;
import com.example.sobirjonovproject.springBoot.repository.BolimRepository;
import org.springframework.stereotype.Service;

@Service
public class BolimService {
    private final BolimRepository bolimRepository;


    public BolimService(BolimRepository bolimRepository) {
        this.bolimRepository = bolimRepository;
    }

    public Bolim add(Bolim bolim){
        return bolimRepository.save(bolim);
    }

    public void delete(Long id){
        bolimRepository.deleteById(id);
    }



}
