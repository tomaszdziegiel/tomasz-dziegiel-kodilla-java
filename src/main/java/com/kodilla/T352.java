package com.kodilla;

import java.lang.*;
import java.util.ArrayList;

class T352 {

    public static void main(String[] args) throws java.lang.Exception{

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n=0; n<30000; n++){
            list.add(n);
        }
        System.out.println("Quantity elements in the collection: " + list.size());

        //Deleting last element from the Collection
        long begin = System.nanoTime();
        list.remove(list.size()-1);
        long end = System.nanoTime();

        System.out.println("Removing last element has taken: " + (end - begin) + " ns");
    }
}
