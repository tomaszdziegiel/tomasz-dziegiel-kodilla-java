package com.kodilla;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;


//(3) 2.1. Przekazanie utworzonej kolejki do metody, rozdzielającej obiekty kolejki na dwie kolekcje ArrayList.
class TasksManager {

    private ArrayList<String> executedParzysteTasks;
    private ArrayList<String> executedNieParzysteTasks;

    //constructor
    public TasksManager() {
        executedParzysteTasks = new ArrayList<String>();
        executedNieParzysteTasks = new ArrayList<String>();
    }

    //method serving the list of tasks
    public void setExecutedTasks(ArrayDeque<String> theQueue) {
        while (theQueue.size() > 0) {
            String theTask = theQueue.poll();
            System.out.println("Processing the task: " + theTask);
            if (theTask.length() % 2 == 0) {
                executedParzysteTasks.add(theTask);
            } else {
                executedNieParzysteTasks.add(theTask);
            }
        }

        //System.out.println("\nExecuted total " + executedParzysteTasks.size() + "tasks\n");
    }

    //getters

    public ArrayList<String> getExecutedParzysteTasks() {
        return executedParzysteTasks;
    }

    public ArrayList<String> getExecutedNieParzysteTasks() {
        return executedNieParzysteTasks;
    }
}

class T34Z {

    //Metoda main
    public static void main(String[] args) throws java.lang.Exception {

        //Tworzenie kolejki ArrayDeque w celu przechowania napisów w postaci litery "a", powtórzonej losową ilość razy w zakresie 1-50.
        ArrayDeque<String> napis = new ArrayDeque<String>();

        Random theGenerator = new Random();

        //for (int n=0; n<theGenerator.nextInt(50); n++){

        for (int n=0; n<50; n++) {
            //Metoda 1
            String s = "";
            for (int k = 0; k < theGenerator.nextInt(50) + 1; k++) {
                s += "a";
            }
            napis.add(s);

            //Metoda 2
            //napis1.offer("a");
            //napis1.add(theGenerator.nextInt(50));
        }

        TasksManager tasksExecutor = new TasksManager();
        tasksExecutor.setExecutedTasks(napis);

        System.out.println(tasksExecutor.getExecutedParzysteTasks());
        System.out.println(tasksExecutor.getExecutedNieParzysteTasks());
    }
}
