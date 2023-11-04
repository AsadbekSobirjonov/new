package com.example.sobirjonovproject.oop.doctor;

public class Doctor {
private String name;
private String last_name;
private Integer age;
private String tajribasi;
private String toifasi;

    public Doctor(String name, String last_name,Integer age, String tajribasi, String toifasi) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.tajribasi = tajribasi;
        this.toifasi = toifasi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTajribasi() {
        return tajribasi;
    }

    public void setTajribasi(String tajribasi) {
        this.tajribasi = tajribasi;
    }

    public String getToifasi() {
        return toifasi;
    }

    public void setToifasi(String toifasi) {
        this.toifasi = toifasi;
    }
}
