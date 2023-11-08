package com.example.sobirjonovproject.oop.doctor;

public class Lor extends Doctor {

    public Lor(String name, String last_name, Integer age, String tajribasi, String toifasi) {
        super(name, last_name, age, tajribasi, toifasi);
    }
    private String yonalish;
    private  String gender;
    private Long bemorlarsoni;


    public Lor(String name, String last_name, Integer age, String tajribasi, String toifasi, String yonalish, String gender, Long bemorlarsoni) {
        super(name, last_name, age, tajribasi, toifasi);
        this.yonalish = yonalish;
        this.gender = gender;
        this.bemorlarsoni = bemorlarsoni;
    }

    public String getYonalish() {
        return yonalish;
    }

    public void setYonalish(String yonalish) {
        this.yonalish = yonalish;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getBemorlarsoni() {
        return bemorlarsoni;
    }

    public void setBemorlarsoni(Long bemorlarsoni) {
        this.bemorlarsoni = bemorlarsoni;
    }
}
