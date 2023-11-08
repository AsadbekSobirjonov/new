package com.example.sobirjonovproject.imtihon.repository.service;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.Student;
import com.example.sobirjonovproject.imtihon.repository.GuruxRepository;

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

    @Transactional(readOnly = true)
    public Page<Gurux> findAll(Pageable pageable){
        return  guruxRepository.findAll(pageable);
    }
}
}
