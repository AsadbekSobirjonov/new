package com.example.sobirjonovproject.oop.person;

public class Person {
    private String ism;
    private int yosh;
    private String jins;

    public Person(String ism, int yosh, String jins) {
        this.ism = ism;
        this.yosh = yosh;
        this.jins = jins;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public String getJins() {
        return jins;
    }

    public void setJins(String jins) {
        this.jins = jins;
    }
}
