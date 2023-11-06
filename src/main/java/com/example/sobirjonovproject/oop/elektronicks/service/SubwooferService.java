package com.example.sobirjonovproject.oop.elektronicks.service;

import com.example.sobirjonovproject.oop.elektronicks.entity.Music;
import com.example.sobirjonovproject.oop.elektronicks.entity.Subwoofer;

import java.util.List;

public class SubwooferService  {
    private Subwoofer subwoofer;


    public Music addMusic(Music name){
        List<Music> music1=subwoofer.getMusiclar();
        music1.add(name);
        return name;
    }
    private void deleteMusic(Music name){
        subwoofer.getMusiclar().remove(name);
    }
    private void valueplus(){
        if (subwoofer.getOvozBalantligi()<100){
        subwoofer.setOvozBalantligi(subwoofer.getOvozBalantligi()+2);
    }}
    private void valueminus(){
        if (subwoofer.getOvozBalantligi()>0){
            subwoofer.setOvozBalantligi(subwoofer.getOvozBalantligi()-2);
        }}
    private Music searchMusic(Music name){
        List<Music> music=  subwoofer.getMusiclar();
        for (Music music1:music) {
            if (music1.equals(name)){
                return name;
            }

        }
        return null;
    }

}

