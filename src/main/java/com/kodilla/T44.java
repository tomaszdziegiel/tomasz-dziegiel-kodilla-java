package com.kodilla;

import java.util.*;
import java.lang.*;

class T44 { //zamiast klasy Cannon wpistałem klasę T44
    public boolean loaded;

    public void fire() {
        if (loaded == false) {

            System.out.println("Canon is empty.");
            loaded = true;
        } else {
            System.out.println("Canon is full.");
        }
    }

    static class Program {

        public static void main(String[] args) {

            List<T44> canons = new LinkedList<T44>();
            canons.add(new T44());
            canons.add(new T44());
            canons.add(new T44());
            canons.add(new T44());
            canons.add(new T44());
            canons.add(new T44());

            for (T44 canon : canons) {
                canon.fire();

            }

            for (T44 canon : canons) {
                //System.out.println(canon.loaded);
                canon.fire();

            }
        }
    }
}

