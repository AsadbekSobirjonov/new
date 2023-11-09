package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Student;
import com.example.sobirjonovproject.imtihon.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
        private final StudentService studentService;


        public StudentController(StudentService studentService) {
        this.studentService = studentService;
        }
        public ResponseEntity save(@RequestBody Student student){
            Student result=studentService.save(student);
        return ResponseEntity.ok(result);
        }
        @DeleteMapping("/delete")
        public ResponseEntity deleteById(@PathVariable Long id){
        studentService.deleteById(id);
        return ResponseEntity.ok("Student malumotlari o'chirildi");
        }
        @GetMapping("/get/{id}")
        public ResponseEntity getById(@PathVariable Long id){
        Student result=studentService.finById(id);
        return ResponseEntity.ok(result);
        }
        @GetMapping("/getall")
        public ResponseEntity getAll(){
                List<Student> result=studentService.findall();
                return ResponseEntity.ok(result);
        }

        }
