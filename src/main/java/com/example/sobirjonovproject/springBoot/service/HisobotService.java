package com.example.sobirjonovproject.springBoot.service;

import com.example.sobirjonovproject.springBoot.entity.Hisobot;
import com.example.sobirjonovproject.springBoot.repository.HisobotRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class HisobotService {
    private final HisobotRepository hisobotRepository;

    public HisobotService(HisobotRepository hisobotRepository) {
        this.hisobotRepository = hisobotRepository;
    }

    public Hisobot save(Hisobot hisobot) {
        return hisobotRepository.save(hisobot);
    }

    public Hisobot updete(Long id, Hisobot updedehisobot) {
        Hisobot hisobot = hisobotRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Hisobod with ID " + id + " not found"));
        hisobot.setXodim(updedehisobot.getXodim());
        hisobot.setReklama_muddati(updedehisobot.getReklama_muddati());
        hisobot.setReklama_turi(updedehisobot.getReklama_turi());
        hisobot.setReklama_xarajati(updedehisobot.getReklama_xarajati());
        return hisobotRepository.save(hisobot);
    }
    public Hisobot getById(Long id){
        Hisobot hisobot = hisobotRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Hisobod with ID " + id + " not found"));
        return hisobot;
    }
    public List<Hisobot> getAll(){
       List<Hisobot> hisobotlar=hisobotRepository.findAll();
       return hisobotlar;
    }
    @Transactional(readOnly = true)
    public Page<Hisobot> findAll(Pageable pageable){
        return  hisobotRepository.findAll(pageable);
    }
}