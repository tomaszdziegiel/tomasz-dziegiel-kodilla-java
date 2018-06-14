package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;



public class T45 {

    public static void main(String[] ars){

        Clock clock1 = new Clock(16, 59);
        Clock clock2 = new Clock(17, 15);
        Clock clock3 = new Clock(18, 30);
        Clock clock4 = new Clock(19, 45);
        Clock clock5 = new Clock(20, 05);
        Clock clock6 = new Clock(21, 20);

        List<Clock> List1 = new LinkedList<>();
        List1.add(clock1);
        List1.add(clock2);
        List1.add(clock3);
        List1.add(clock4);
        List1.add(clock5);
        List1.add(clock6);

        for (Clock clock: List1){
            System.out.println(clock);
        }
        for (Clock clock: List1){
            clock.move();
        }
        for (Clock clock: List1) {
            System.out.println(clock);
        }
    }

}

class Clock {

   private Integer hours;
   private Integer minutes;

   //Constructor
   public Clock( Integer hours, Integer minutes){
       this.hours = hours;
       this.minutes = minutes;
   }


    public void setHours(Integer hours) {

       this.hours = hours;
    }

    public void setMinutes(Integer minutes) {

       this.minutes = minutes;
    }
    @Override
    public String toString() {

       return "" + hours + ":" + minutes;
       }

       public void move(){
       if (minutes == 59) {
           minutes = 0;
           hours++;
       }else{
           minutes++;
       }
    }
}