package com.example.sobirjonovproject.oop.car;

public class Car {
    private String rang;
    private String model;
    private double narx;
    private String tuzilma;

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getNarx() {
        return narx;
    }

    public void setNarx(double narx) {
        this.narx = narx;
    }

    public String getTuzilma() {
        return tuzilma;
    }

    public void setTuzilma(String tuzilma) {
        this.tuzilma = tuzilma;
    }

    public Car(String rang, String model, double narx, String tuzilma) {
        this.rang = rang;
        this.model = model;
        this.narx = narx;
        this.tuzilma = tuzilma;

    }
}
