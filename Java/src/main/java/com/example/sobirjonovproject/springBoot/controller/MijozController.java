package com.example.sobirjonovproject.springBoot.controller;

import com.example.sobirjonovproject.springBoot.entity.Mijoz;
import com.example.sobirjonovproject.springBoot.service.MijozService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/mijoz")
public class MijozController {
   private final MijozService mijozService;

    public MijozController(MijozService mijozService) {
        this.mijozService = mijozService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Mijoz mijoz){
        Mijoz result=mijozService.save(mijoz);
        return ResponseEntity.ok(result);
    }
    @PutMapping("/updete")
    public ResponseEntity updete(@PathVariable Long id,@RequestBody Mijoz updeteMijoz){
        Mijoz mijoz=mijozService.updete(id, updeteMijoz);
        return ResponseEntity.ok(mijoz);
    }
    @GetMapping("/finById/{id}")
    public ResponseEntity getByIs(@PathVariable Long id){
        Optional<Mijoz> result=mijozService.findById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/getAll")
    public ResponseEntity getByAll(){
        Set<Mijoz> result=mijozService.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/finByXOdim")
    public ResponseEntity find(@PathVariable Long xodimId){
        Set<Mijoz> result=mijozService.findXodimId(xodimId);
        return ResponseEntity.ok(result);
    }
}
