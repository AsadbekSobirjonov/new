package com.example.sobirjonovproject.oop.doctor;

public class Xirug extends Doctor{


    public Xirug(String name, String last_name, Integer age, String tajribasi, String toifasi) {
        super(name, last_name, age, tajribasi, toifasi);
    }
    private String yonalish;
    private  String gender;
    private Long OperatsiyalarSoni;

    public Xirug(String name, String last_name, Integer age, String tajribasi, String toifasi, String yonalish, String gender, Long operatsiyalarSoni) {
        super(name, last_name, age, tajribasi, toifasi);
        this.yonalish = yonalish;
        this.gender = gender;
        OperatsiyalarSoni = operatsiyalarSoni;
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

    public Long getOperatsiyalarSoni() {
        return OperatsiyalarSoni;
    }

    public void setOperatsiyalarSoni(Long operatsiyalarSoni) {
        OperatsiyalarSoni = operatsiyalarSoni;
    }
}
