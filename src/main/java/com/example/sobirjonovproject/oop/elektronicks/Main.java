package com.example.sobirjonovproject.oop.elektronicks;

import com.example.sobirjonovproject.oop.elektronicks.entity.Laptop;
import com.example.sobirjonovproject.oop.elektronicks.entity.Music;
import com.example.sobirjonovproject.oop.elektronicks.entity.Pc;
import com.example.sobirjonovproject.oop.elektronicks.service.CamputerService;
import com.example.sobirjonovproject.oop.elektronicks.service.ElektronicsService;
import com.example.sobirjonovproject.oop.elektronicks.service.MusicService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MusicService musicService = null;
        ElektronicsService elektronicsService = null;
        CamputerService camputerService=null;


        System.out.println("kluchator \n" +
                "1-qo'shish\n" +
                "2-ajratish");
        int n=scanner.nextInt();
        switch (n){
            case 1: elektronicsService.kluchatorqoshqosh(); System.out.println("kluchator qo'shildi");;break;
            case 2: elektronicsService.kluchatorajrat();System.out.println("kluchator ajratildi");
        }
        System.out.println("1-kampyuter\n"+
                "2-music");
        int a=scanner.nextInt();
        if (a==1){
        switch (a){
            case 1:
                System.out.println("1- music qo'shish\n 3-musicni boshlash\n 4-musicni to'xtatish\n");
                int x=scanner.nextInt();
                switch (x){
                    case 1:
                        System.out.println("qo'shmoqchi bo'lgan music nomini kriting:");
                        Music music=new Music(scanner.next());
                        musicService.addMusic(music);break;
                    case 2:
                        musicService.MusicBoshla();break;
                    case 3:
                        musicService.MusicToxtatish();break;
                }; break;
            case 2:
                System.out.println("1-laptop qo'shish\n, 2-Pc ni ishlatish");
                int z=scanner.nextInt();
                switch (z){
                    case 1:
                        System.out.println("qo'shmoqchi bo'lgan laptopni kriting:");
                        Laptop laptop=new Laptop(scanner.nextLong(),scanner.next(),scanner.nextLong());
                        camputerService.addLaptop(laptop);break;
                    case 2:
                        System.out.println("qo'shmoqchi bo'lgan pcni kriting:");
                        Pc pc=new Pc(scanner.nextLong(),scanner.next(),scanner.nextLong());camputerService.addPc(pc);break;
                }
        }
        }else {
            System.out.println("iltimos kluchatorni qo'shing");
        }



    }

}
