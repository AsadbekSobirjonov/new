package com.example.sobirjonovproject.oop.elektronicks.entity;

import java.util.List;

public class Subwoofer {
  private Long id;
  private Integer ovozBalantligi;
  private List<Music> musiclar;

    public Subwoofer(Long id, Integer ovozBalantligi, List<Music> musiclar) {
        this.id = id;
        this.ovozBalantligi = ovozBalantligi;
        this.musiclar = musiclar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOvozBalantligi() {
        return ovozBalantligi;
    }

    public void setOvozBalantligi(Integer ovozBalantligi) {
        this.ovozBalantligi = ovozBalantligi;
    }

    public List<Music> getMusiclar() {
        return musiclar;
    }

    public void setMusiclar(List<Music> musiclar) {
        this.musiclar = musiclar;
    }
}
