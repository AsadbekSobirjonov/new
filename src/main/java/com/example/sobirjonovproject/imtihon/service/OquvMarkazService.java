package com.example.sobirjonovproject.imtihon.service;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.OquvMarkaz;
import com.example.sobirjonovproject.imtihon.repository.OquvMarkazRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
public class OquvMarkazService {
    private final OquvMarkazRepository oquvMarkazRepository;
    public OquvMarkazService(OquvMarkazRepository oquvMarkazRepository) {
        this.oquvMarkazRepository=oquvMarkazRepository;
    }


    public OquvMarkaz save(OquvMarkaz oquvMarkaz){
        return oquvMarkazRepository.save(oquvMarkaz);
    }


    public void deleteById(Long id){
        oquvMarkazRepository.deleteById(id);
    }

    public Set<Gurux> getAllGurux(Long id){
        OquvMarkaz oquvMarkaz=oquvMarkazRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("oquvMarkaz with ID " + id + " not found"));
        Set<Gurux> guruxlar=oquvMarkaz.getGurux();
        return guruxlar;
    }

    public OquvMarkaz finById(Long id){
        return oquvMarkazRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("O'quvMarkaz with ID " + id + " not found"));
    }

   public List<OquvMarkaz> findAll(){
        return oquvMarkazRepository.findAll();
   }
}

