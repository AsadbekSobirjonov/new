package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Teacher;
import com.example.sobirjonovproject.imtihon.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    public ResponseEntity save(@RequestBody Teacher teacher){
        Teacher result=teacherService.save(teacher);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteById(@PathVariable Long id){
        teacherService.deleteById(id);
        return ResponseEntity.ok("Teacher malumotlari o'chirildi");
    }
    @GetMapping("/get/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        Teacher result=teacherService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/getall")
    public ResponseEntity getAll(){
        List<Teacher> result=teacherService.getAll();
        return ResponseEntity.ok(result);
    }
}
