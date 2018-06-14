package com.kodilla;

import java.lang.*;
import java.util.ArrayList;

class T351 {

    public static void main(String[] args) throws java.lang.Exception{

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n=0; n<3000000; n++){
            list.add(n);
        }
        System.out.println(list.size());
    }
}
