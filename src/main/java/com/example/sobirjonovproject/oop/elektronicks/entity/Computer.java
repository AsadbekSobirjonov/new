package com.example.sobirjonovproject.oop.elektronicks.entity;

import java.util.List;

public class Computer {
    private Long id;
    private List<Laptop> laptop;
    private List<Pc> pc;

    public Computer(Long id, List<Laptop> laptop, List<Pc> pc) {
        this.id = id;
        this.laptop = laptop;
        this.pc = pc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public List<Pc> getPc() {
        return pc;
    }

    public void setPc(List<Pc> pc) {
        this.pc = pc;
    }
}
