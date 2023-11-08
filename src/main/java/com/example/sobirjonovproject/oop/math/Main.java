package com.example.sobirjonovproject.oop.math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MathFunctions mathFunctions=new MathFunctions();
        System.out.println("uchburchak tomonlarini kriting!");
        System.out.print("a=");
        int a=scanner.nextInt();
        System.out.print("b=");
        int b=scanner.nextInt();
        System.out.print("c=");
        int c=scanner.nextInt();
        System.out.println(mathFunctions.uchburchakYuza(a, b, c));
        System.out.print("radius=");
        int R=scanner.nextInt();
        System.out.println(mathFunctions.doiraYuzi(R));
        System.out.print("n=");
        int n=scanner.nextInt();
        System.out.println(mathFunctions.eDaraja(n));

    }
}
