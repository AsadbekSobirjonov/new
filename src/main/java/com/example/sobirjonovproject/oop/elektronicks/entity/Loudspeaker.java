package com.example.sobirjonovproject.oop.elektronicks.entity;

public class Loudspeaker {
private Long id;
private Boolean ovoz;

    public Loudspeaker(Long id, Boolean ovoz) {
        this.id = id;
        this.ovoz = ovoz;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOvoz() {
        return ovoz;
    }

    public void setOvoz(Boolean ovoz) {
        this.ovoz = ovoz;
    }
}
