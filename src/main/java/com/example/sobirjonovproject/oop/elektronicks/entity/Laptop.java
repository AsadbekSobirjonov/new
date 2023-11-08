package com.example.sobirjonovproject.oop.elektronicks.entity;

public class Laptop {
    private Long id;
    private String nomi;
    private Long pamyati;


    public Laptop(Long id, String nomi, Long pamyati) {
        this.id = id;
        this.nomi = nomi;
        this.pamyati = pamyati;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomi() {
        return nomi;
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }

    public Long getPamyati() {
        return pamyati;
    }

    public void setPamyati(Long pamyati) {
        this.pamyati = pamyati;
    }
}
