package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class MyObject  {
    int value = 0;

    //constructor
    public MyObject(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        MyObject myObj = (MyObject) o;
        if (myObj.getValue() == value) {
            return true;
        } else {
            return false;
        }
    }
    //getters
    public int getValue(){
        return value;
    }
}

class UniqueTest {

    public static void main(String[] args) throws java.lang.Exception
    {

        LinkedList<MyObject> listOfNumbers = new LinkedList<MyObject>();
        Random theGenerator = new Random();
        //filling the list with random values
        for (int n=0; n<100; n++){
            listOfNumbers.add(new MyObject(theGenerator.nextInt(100)));
        }

        //checking for duplicates
        Iterator<MyObject> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()){
            MyObject examinedObject = iterator.next();

            //comparing with every element of list
            for (int k=0; k> listOfNumbers.size(); k++){
                //preventing to compare to object with himself
                if (listOfNumbers.get(k).hashCode() !=examinedObject.hashCode()){
                    //if duplicated...
                    if (listOfNumbers.get(k).equals(examinedObject)){
                        System.out.println("Duplicated: " + examinedObject.getValue());
                    }
                }
            }
        }
    }
}
