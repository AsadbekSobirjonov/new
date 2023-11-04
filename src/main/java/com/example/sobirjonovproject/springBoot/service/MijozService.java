package com.example.sobirjonovproject.springBoot.service;

import com.example.sobirjonovproject.springBoot.entity.Mijoz;
import com.example.sobirjonovproject.springBoot.entity.Xodim;
import com.example.sobirjonovproject.springBoot.repository.MijozRepository;
import com.example.sobirjonovproject.springBoot.repository.XodimRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

@Service
public class MijozService {
    private final MijozRepository mijozRepository;
    private final XodimRepository xodimRepository;

    public MijozService(MijozRepository mijozRepository, XodimRepository xodimRepository) {
        this.mijozRepository = mijozRepository;
        this.xodimRepository = xodimRepository;
    }

    public Mijoz save(Mijoz mijoz){
        return mijozRepository.save(mijoz);
    }

    public Mijoz updete(Long id, Mijoz updeteMijoz){
      Mijoz mijoz=mijozRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Mijoz with ID " + id + " not found"));
       mijoz.setId(mijoz.getId());
       mijoz.setPasport(mijoz.getPasport());
       mijoz.setManzili(updeteMijoz.getManzili());
       mijoz.setDate(updeteMijoz.getDate());
       return mijozRepository.save(mijoz);
    }

    public Optional<Mijoz> findById(Long id){
      Optional<Mijoz> result=mijozRepository.findById(id);
      return result;
    }
    public Set<Mijoz>  findAll(){
        Set<Mijoz> mijozlar= new HashSet<>();
        mijozlar.addAll(mijozRepository.findAll());
        return mijozlar;
    }
    public void  delete(Long id){
     mijozRepository.deleteById(id);
    }
    public Set<Mijoz> findXodimId(Long xodimId){
        Set<Mijoz> mijozlar= new HashSet<>();
        Set<Mijoz> mijozs=new HashSet<>();
        mijozlar.addAll(mijozRepository.findAll());
        for(Mijoz mijoz: mijozlar){
           if( mijoz.getXodim().equals(chekXodim(xodimId))){
               mijozs.add(mijoz);
           }
        }
        return mijozs;

    }
    public Xodim chekXodim(Long id){
        Xodim xodim=xodimRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Mijoz with ID " + id + " not found"));
        return xodim;
    }
}
