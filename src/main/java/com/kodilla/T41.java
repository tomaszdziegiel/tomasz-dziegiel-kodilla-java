package com.kodilla;

import java.lang.*;
import java.util.*;
import java.io.*;


/*
class Companies {
    private String DELL;
    private String APPLE;
    private String SAMSUNG;
    private String SONY;
    private String ALCATEL;

    //Constructor
    public Companies (String DELL, String APPLE, String SAMSUNG, String SONY, String ALCATEL){
        this.DELL = DELL;
        this.APPLE = APPLE;
        this.SAMSUNG = SAMSUNG;
        this.SONY = SONY;
        this.ALCATEL = ALCATEL;
    }

    //toString
    public String toString(){
        return DELL + ", " + APPLE + ", " + SAMSUNG + ", " + SONY + ", " + ALCATEL;
    }

    //Getters

    public String getDELL() {
        return DELL;
    }

    public String getAPPLE() {
        return APPLE;
    }

    public String getSAMSUNG() {
        return SAMSUNG;
    }

    public String getSONY() {
        return SONY;
    }

    public String getALCATEL() {
        return ALCATEL;
    }
}
*/
/*
class List1 {
    private String name;

    //constructor
    List1(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", ";
    }

    public String getName() {
        return name;
    }
}
*/
class T41 {
    public static void main (String[] args) {

        List<String> companies = new ArrayList();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

String wynik = "";

        for (Integer i=0; i<companies.size(); i++){
            if (companies.size()-1 == i){
                wynik += companies.get(i);
                break;
            }
            wynik = wynik + companies.get(i) + ", ";
        }
        System.out.println(wynik);
    }
}

