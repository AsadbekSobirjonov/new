package com.example.sobirjonovproject.springBoot.controller;

import com.example.sobirjonovproject.springBoot.entity.Hisobot;
import com.example.sobirjonovproject.springBoot.service.HisobotService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hisobot")
public class HisobotController {
    private final HisobotService hisobotService;

    public HisobotController(HisobotService hisobotService) {
        this.hisobotService = hisobotService;
    }
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Hisobot hisobot){
        Hisobot result=hisobotService.save(hisobot);
        return ResponseEntity.ok(result);
    }
    @PutMapping("/updete/{id}")
    public ResponseEntity updete(@PathVariable Long id,@RequestBody Hisobot updeteHisobot){
        Hisobot hisobot=hisobotService.updete(id, updeteHisobot);
        return ResponseEntity.ok(hisobot);
    }
    @GetMapping("get/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        Hisobot hisobot=hisobotService.getById(id);
        return ResponseEntity.ok(hisobot);
    }
    @GetMapping("/getALl")
    public ResponseEntity getAll(){
        List<Hisobot> reslut=hisobotService.getAll();
        return ResponseEntity.ok(reslut);
    }

    @GetMapping("getAll/paging")
    public ResponseEntity getAllPaging(Pageable pageable){
        Page<Hisobot> result=hisobotService.findAll(pageable);
        return ResponseEntity.ok(result);
    }
}
