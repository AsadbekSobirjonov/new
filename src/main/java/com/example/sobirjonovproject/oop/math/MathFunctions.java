package com.example.sobirjonovproject.oop.math;

public class MathFunctions {

    private final static double pi=3.14159265359;
    private final static double e=2.71828182846;

   public double doiraYuzi(int R){
       return 2*pi*R*R;
   }
   public double eDaraja(int n){
       return Math.pow(e,n);
   }
    public double uchburchakYuza(int a, int b, int c) {
        double s = (a+b+c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
