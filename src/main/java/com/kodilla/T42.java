package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class Orders{

    String name;

    //Constructor
    public Orders(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Orders e = (Orders) o;
        return (name.equals(e.getName()));
    }

    @Override
    public String toString() {
        return name + ", ";
    }

    //Getters
    public String getName() {
        return name;
    }
}

class T42 {

    public static void main (String[] args) throws java.lang.Exception
    {

        //Creating 3 example Orders object
        Orders order1 = new Orders("Komputer X 270");
        Orders order2 = new Orders("Komputer X 260");
        Orders order3 = new Orders("Komputer X 250");

        //Creating a HashSer and filling it the set
        HashSet<Orders> ordersHashSet = new HashSet<Orders>();
        ordersHashSet.add(order3);
        ordersHashSet.add(order2);
        ordersHashSet.add(order1);

        //Print out every orders from the set
        for (Orders theOrder: ordersHashSet){
            System.out.println(theOrder);
        }

    }
}
