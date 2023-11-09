package com.example.sobirjonovproject.imtihon.service;

import com.example.sobirjonovproject.imtihon.entity.Student;
import com.example.sobirjonovproject.imtihon.repository.StudentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    public Student finById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Student with ID " + id + " not found"));
    }


    public List<Student> findall(){
        List<Student> students= studentRepository.findAll();
        return students;
    }
}


