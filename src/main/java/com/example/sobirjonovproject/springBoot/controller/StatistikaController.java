package com.example.sobirjonovproject.springBoot.controller;

import com.example.sobirjonovproject.springBoot.entity.Statistika;
import com.example.sobirjonovproject.springBoot.service.StatistikaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistika")
public class StatistikaController {
    private final StatistikaService service;

    public StatistikaController(StatistikaService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public ResponseEntity getStatistika(){
        Statistika result= service.getStatistika();
        return ResponseEntity.ok(result);
    }
}
