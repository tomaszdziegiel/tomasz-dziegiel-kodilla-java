package com.kodilla;

import java.util.*;

public class T33 {

    public static void main(String[] args){

        int sumaA = 1000;
        int sumaB = 0;
        int c = 0;

        System.out.println("Zalozenia poczatkowe:");
        System.out.println("sumaA = " + sumaA);
        System.out.println("sumaB = " + sumaB);
        System.out.println("\nRozpoczynamy wykonanie zadania =>");

        Random randomGenerator = new Random();

        while (sumaA > sumaB){

            int a = randomGenerator.nextInt(10);
            int b = randomGenerator.nextInt(50);

            c++; //licznik przebiegu petli

            sumaA += a;
            sumaB += b;

            System.out.println("\n Numer przebiegu petli: " + c + ".");
            System.out.println("Zmienna a = " + a);
            System.out.println("Zmienna b = " + b);
            System.out.println("sumaA     = " + sumaA);
            System.out.println("sumaB     = " + sumaB);
        }

        System.out.println("\n Zadanie wykonane: sumaA < sumaB.");
    }
}
