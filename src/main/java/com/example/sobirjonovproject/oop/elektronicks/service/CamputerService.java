package com.example.sobirjonovproject.oop.elektronicks.service;

import com.example.sobirjonovproject.oop.elektronicks.entity.Computer;
import com.example.sobirjonovproject.oop.elektronicks.entity.Laptop;
import com.example.sobirjonovproject.oop.elektronicks.entity.Pc;

public class CamputerService {
    private final Computer computer;

    public CamputerService(Computer computer) {
        this.computer = computer;
    }

    public Computer addLaptop(Laptop laptop){
        computer.getLaptop().add(laptop);
        return computer;
    }
    public Computer addPc(Pc pc){
        computer.getPc().add(pc);
        return computer;
    }

}
