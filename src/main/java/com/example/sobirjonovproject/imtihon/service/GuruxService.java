package com.example.sobirjonovproject.imtihon.service;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.Student;
import com.example.sobirjonovproject.imtihon.repository.GuruxRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
public class GuruxService {
    private final GuruxRepository guruxRepository;
    public GuruxService(GuruxRepository guruxRepository) {
        this.guruxRepository = guruxRepository;
    }


    public Gurux save(Gurux gurux){
        return guruxRepository.save(gurux);
    }


    public void deleteById(Long id){
        guruxRepository.deleteById(id);
    }

    public Set<Student> getAllStudent(Long id){
        Gurux gurux=guruxRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("gurux with ID " + id + " not found"));
        Set<Student> students=gurux.getStudent();
        return students;
    }

    public Gurux finById(Long id){
        return guruxRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("gurux with ID " + id + " not found"));
    }

   public List<Gurux> finAll(){
        return guruxRepository.findAll();
   }
}

