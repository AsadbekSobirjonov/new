package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.OquvMarkaz;
import com.example.sobirjonovproject.imtihon.service.OquvMarkazService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/oquvmarkaz")
public class OquvMArkazRepository {
    private final OquvMarkazService oquvMarkazService;


    public OquvMArkazRepository(OquvMarkazService oquvMarkazService) {
        this.oquvMarkazService = oquvMarkazService;
    }

    public ResponseEntity save(@RequestBody OquvMarkaz oquvMarkaz){
        OquvMarkaz result=oquvMarkazService.save(oquvMarkaz);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteById(@PathVariable Long id){
       oquvMarkazService.deleteById(id);
        return ResponseEntity.ok("oquvMarkaz malumotlari o'chirildi");
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        OquvMarkaz result=oquvMarkazService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/getall")
    public ResponseEntity getAll(){
        List<OquvMarkaz> result=oquvMarkazService.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getAllStudent(@PathVariable Long id){
        Set<Gurux> result=oquvMarkazService.getAllGurux(id);
        return ResponseEntity.ok(result);
    }
}
