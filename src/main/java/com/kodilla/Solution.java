package com.kodilla;

//Utwórz klasę Arithmetic z metodą add, która przyjmuje dwie liczby jako parametry i zwraca ich sumę.
//Utwórz klasę Adder dziedziczącą po klasie Arithmetic.

class Arithmetic {

    double add(double n1, double n2) {
        double a = n1 + n2;
        return a;
    }
}

class Adder extends Arithmetic {

}

public class Solution {
    public static void main(String[] args) {
        Arithmetic a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
