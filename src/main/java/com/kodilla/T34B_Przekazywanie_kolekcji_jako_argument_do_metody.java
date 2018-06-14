package com.kodilla;

import java.util.*;
import java.lang.*;

class ArrayTester {

    public void printEven(ArrayList<Integer> theList){
        int temporatyValue = 0;
        for (int n=0; n < theList.size(); n++){
            temporatyValue = theList.get(n);
            if (temporatyValue % 2 == 0){
                System.out.println(temporatyValue);
            }
        }
    }
}

class CollectionAsParameter {

    public static void main(String[]args) throws java.lang.Exception {
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int n=0; n<200; n++){
            theBigList.add(theGenerator.nextInt(100));
             };
        ArrayTester tester = new ArrayTester();
        tester.printEven(theBigList);
    }
}
