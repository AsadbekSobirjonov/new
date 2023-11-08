package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.OquvMarkaz;
@RestController
@RequestMapping("/oquvmarkaz")
public class OquvMArkazRepository {
    private final OquvMarkazService oquvMarkazService;


    public OquvMarkazController(OquvMarkazService oquvMarkazService) {
      this.oquvMarkazService=oquvMarkazService;
    }
    public ResponseEntity save(@RequestBody OquvMarkaz oquvMarkaz){
        OquvMarkaz result=oquvMarkazService.save(student);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteById(@PathVariable Long id){
       oquvMarkazService.deleteById(id);
        return ResponseEntity.ok("oquvMarkaz malumotlari o'chirildi");
    }
    @GetMapping("/get")
    public ResponseEntity getById(@PathVariable Long id){
        OquvMarkaz result=oquvMarkazService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getAllStudent(@PathVariable Long id){
        Set<Gurux> result=oquvMarkazServiceService.getAllStudent(id);
        return ResponseEntity.ok(result);
    }
}
