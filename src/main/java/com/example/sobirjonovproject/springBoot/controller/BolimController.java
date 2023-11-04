package com.example.sobirjonovproject.springBoot.controller;


import com.example.sobirjonovproject.springBoot.entity.Bolim;
import com.example.sobirjonovproject.springBoot.repository.BolimRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bolim")
@CrossOrigin(value = "*")
public class BolimController {
 private final BolimRepository bolimRepository;

    public BolimController(BolimRepository bolimRepository) {
        this.bolimRepository = bolimRepository;
    }


    @PostMapping("/boshqaruv")
    public Bolim boshqaruv(){
        return Bolim.builder().id(1L).name("Boshqaruv").build();
    }

    @PostMapping("/mijozlar")
    public Bolim mijozlar(){
        return Bolim.builder().id(2L).name("Mijozlar").build();
    }

    @PostMapping("/savdo")
    public Bolim savdo(){
        return Bolim.builder().id(3L).name("Savdo").build();
    }
    @PostMapping("/save")
    public ResponseEntity save(Bolim bolim){
        Bolim result=bolimRepository.save(bolim);
        return ResponseEntity.ok(result);
    }
   @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        bolimRepository.deleteById(id);
        return ResponseEntity.ok("Bo'lim o'chirildi");
   }

}
