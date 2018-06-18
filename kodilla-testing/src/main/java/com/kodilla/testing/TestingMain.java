package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
} else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        double resultc = calculator.add(2,3);
        double resultd = calculator.subtract(3,2);

        if (resultc == 5){
            System.out.println("Test OK");
        }else{
            System.out.println("Error!");
        }

        if (resultd == 1){
            System.out.println("Test OK");
        }else{
            System.out.println("Error!");
        }



    }
}
