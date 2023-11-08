package com.example.sobirjonovproject.imtihon.Controller;

import com.example.sobirjonovproject.imtihon.entity.Student;

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
        @GetMapping("/get")
        public ResponseEntity getById(@PathVariable Long id){
        Student result=studentService.finById(id);
        return ResponseEntity.ok(result);
        }
        @GetMapping("getAll/paging")
        public ResponseEntity getAllPaging(Pageable pageable){
        Page<Student> result=studentService.findAll(pageable);
        return ResponseEntity.ok(result);
        }

        }
