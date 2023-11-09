package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.Student;
import com.example.sobirjonovproject.imtihon.service.GuruxService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("/gurux")
public class GuruxController {
    private final GuruxService guruxService;


    public GuruxController(GuruxService guruxService) {
        this.guruxService = guruxService;
    }
    public ResponseEntity save(@RequestBody Gurux gurux){
        Gurux result=guruxService.save(gurux);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteById(@PathVariable Long id){
        guruxService.deleteById(id);
        return ResponseEntity.ok("Gurux malumotlari o'chirildi");
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        Gurux result=guruxService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("getall")
    public ResponseEntity getAll(){
        List<Gurux> result=guruxService.finAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getAllStudent(@PathVariable Long id){
        Set<Student> result=guruxService.getAllStudent(id);
        return ResponseEntity.ok(result);
    }

}
