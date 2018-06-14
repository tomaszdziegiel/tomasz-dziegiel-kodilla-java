package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

public class T47 {

    public static void main(String[] args) {
        int a = 136;
        int b = 288;

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println(a);
    }
}
