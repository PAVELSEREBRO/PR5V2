package ru.mirea.gibo01.pr5;

import pr5.Planet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet planet = Planet.МЕРКУРИЙ;
        System.out.println("Какой ваш вес?");
        Scanner sc = new Scanner(System.in);
        int ves = sc.nextInt();
        double mas = ves/planet.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.println("Your weight on %s is %f%n", p, p.surfaceWeight(mas));

        DecimalFormat fmt = new DecimalFormat("#.");
        for (Planet p : Planet.values())
            System.out.println("Ваш вес на планете: " + p + " " +fmt.format(p.surfaceWeight(mas)));
    }
}
