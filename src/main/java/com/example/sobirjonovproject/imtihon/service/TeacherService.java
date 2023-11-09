package com.example.sobirjonovproject.imtihon.service;

import com.example.sobirjonovproject.imtihon.entity.Teacher;
import com.example.sobirjonovproject.imtihon.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository=teacherRepository;
    }

    public Teacher save(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public void deleteById(Long id){
        teacherRepository.deleteById(id);
    }

    public Teacher finById(Long id){
        return teacherRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Student with ID " + id + " not found"));
    }


    public List<Teacher> getAll(){
     List<Teacher> teachers= teacherRepository.findAll();
     return teachers;
    }


}

