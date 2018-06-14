package com.kodilla;

import java.lang.*;
import java.util.ArrayList;

class T353 {

    public static void main(String[] args) throws java.lang.Exception{

        //Creating collection with 8000000 elements of type Integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n=0; n<7000000; n++){
            list.add(n);
        }

        //Display quantity of elements
        System.out.println("Quantity elements in the collection: " + list.size());

        //Deleting last element from the Collection
        long begin = System.currentTimeMillis();
        list.remove(list.size()-1);
        long end = System.currentTimeMillis();

        //Displaying time of deletion
        System.out.println("Removing last element has taken: " + (end - begin) + " ms");

        //Deleting last element from collection
        begin = System.currentTimeMillis();
        list.remove(0);
        end = System.currentTimeMillis();

        //Displaying time of deletion
        System.out.println("Removing first element has taken: " + (end - begin) + " ms");
    }
}