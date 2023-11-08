package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.Student;
import java.util.Set;
@RestController
@RequestMapping("/gurux")
public class GuruxController {
    private final GuruxService guruxService;


    public GuruxController(GuruxService guruxService) {
        this.guruxService = guruxService;
    }
    public ResponseEntity save(@RequestBody Gurux gurux){
        Student result=guruxService.save(student);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteById(@PathVariable Long id){
        guruxService.deleteById(id);
        return ResponseEntity.ok("Gurux malumotlari o'chirildi");
    }
    @GetMapping("/get")
    public ResponseEntity getById(@PathVariable Long id){
        Gurux result=guruxService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getAllStudent(@PathVariable Long id){
        Set<Student> result=guruxService.getAllStudent(id);
        return ResponseEntity.ok(result);
    }

}
