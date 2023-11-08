package com.example.sobirjonovproject.springBoot.controller;

import com.example.sobirjonovproject.springBoot.entity.Xodim;
import com.example.sobirjonovproject.springBoot.service.XodimService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/xodim")
public class XodimController {
    private final XodimService xodimService;


    public XodimController(XodimService xodimService) {
        this.xodimService = xodimService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Xodim xodim){
        if (xodimService.chekAge(xodim.getAge())){
            return new ResponseEntity("bizda 18 yoshdan kattalar ishga olinadi", HttpStatus.BAD_REQUEST);
        }
        Xodim result=xodimService.save(xodim);
        return ResponseEntity.ok(result);
    }
    @PutMapping("/updete")
    public ResponseEntity updete(@PathVariable Long id,@RequestBody Xodim updeteXodim){
        Xodim result=xodimService.updete(id,updeteXodim);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteById(@PathVariable Long id){
        xodimService.deleteById(id);
        return ResponseEntity.ok("xodim malumotlari o'chirildi");
    }
    @GetMapping("/get")
    public ResponseEntity getById(@PathVariable Long id){
        Xodim result=xodimService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("getAll/paging")
    public ResponseEntity getAllPaging(Pageable pageable){
        Page<Xodim> result=xodimService.findAll(pageable);
        return ResponseEntity.ok(result);
    }
}
