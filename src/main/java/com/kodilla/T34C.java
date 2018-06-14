package com.kodilla;

import java.util.*;
import java.lang.*;

class TaskManager {

    ArrayList<String> executedTasks;

    //constructor
    public TaskManager() {
        executedTasks = new ArrayList<String>();
    }

    //method serving the list of tasks
    public void executeTasks(ArrayDeque<String> theQueue){
        while (theQueue.size()>0){
            String theTask = theQueue.poll();
            System.out.println("Processingn the task: " + theTask);
            executedTasks.add(theTask);
        }
        System.out.println("\nExecuted total " + executedTasks.size() + " tasks\n");
    }
}

class QueuesAndLoops{

    public static void main (String[] args) throws java.lang.Exception

    {

        //the first task's list
        ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
        for (int n = 0; n < 5; n++) {
            taskQueue1.offer("The first task number " + (n + 1));
        }

        //the second task's list
        ArrayDeque<String> taskQueue2 = new ArrayDeque<String>();
        for (int n = 0; n < 5; n++) {
            taskQueue2.offer("The second task number " + (n + 1));
        }

        //the second task's list
        ArrayDeque<String> taskQueue3 = new ArrayDeque<String>();
        for (int n = 0; n < 15; n++) {
            taskQueue3.offer("The third task number " + (n + 1));
        }

        TaskManager taskExecutor = new TaskManager();
        taskExecutor.executeTasks(taskQueue1);
        taskExecutor.executeTasks(taskQueue2);
        taskExecutor.executeTasks(taskQueue3);
    }
}
