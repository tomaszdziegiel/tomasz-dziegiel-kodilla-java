//Zadanie A
//Generowanie danych testowych przy pomocy pętli for.

package com.kodilla;

import java.util.*;
import java.lang.*;


class BigTestData {

    public static void main (String[] args) throws java.lang.Exception{

        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int n = 0; n < 20000; n++) {
            theBigList.add(theGenerator.nextInt(5000));
        }
        System.out.println("The Big List contains now " + theBigList.size() + " objects.");
    }
}