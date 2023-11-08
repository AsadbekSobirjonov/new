package com.example.sobirjonovproject.imtihon.repository.service;

import com.example.sobirjonovproject.imtihon.entity.Gurux;
import com.example.sobirjonovproject.imtihon.entity.OquvMarkaz;
import com.example.sobirjonovproject.imtihon.repository.OquvMarkazRepository;

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

    public Set<OquvMarkaz> getAllGurux(Long id){
        OquvMarkaz oquvMarkaz=oquvMarkazRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("oquvMarkaz with ID " + id + " not found"));
        Set<Gurux> guruxlar=oquvMarkaz.getGurux();
        return guruxlar;
    }

    public OquvMarkaz finById(Long id){
        return oquvMarkazRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("O'quvMarkaz with ID " + id + " not found"));
    }

    @Transactional(readOnly = true)
    public Page<OquvMarkaz> findAll(Pageable pageable){
        return  guruxRepository.findAll(pageable);
    }
}
}
