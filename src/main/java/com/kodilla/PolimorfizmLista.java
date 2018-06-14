package com.kodilla;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolimorfizmLista {

    public static void main(String[] args) {

        List<Integer> Lista1 = new ArrayList<Integer>();
        Lista1.add(1);
        Lista1.add(4);
        Lista1.add(8);


        List<Integer> Lista2 = new LinkedList<>();
        Lista2.add(1);
        Lista2.add(5);
        Lista2.add(7);

        System.out.println(suma(Lista1));
        System.out.println(suma(Lista2));
    }

    static int suma(List<Integer> Lista){
        int s1 = 0;
        for (int suma1 : Lista
             ) {
           s1 += suma1;
        }
        return s1;
    }
}
